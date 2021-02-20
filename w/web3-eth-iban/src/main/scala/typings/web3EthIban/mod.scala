package typings.web3EthIban

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web3-eth-iban", "Iban")
  @js.native
  class Iban protected () extends StObject {
    def this(iban: String) = this()
    
    def checksum(): String = js.native
    
    def client(): String = js.native
    
    def institution(): String = js.native
    
    def isDirect(): Boolean = js.native
    
    def isIndirect(): Boolean = js.native
    
    def isValid(): Boolean = js.native
    
    def toAddress(): String = js.native
  }
  /* static members */
  object Iban {
    
    @JSImport("web3-eth-iban", "Iban.createIndirect")
    @js.native
    def createIndirect(options: IndirectOptions): Iban = js.native
    
    @JSImport("web3-eth-iban", "Iban.fromAddress")
    @js.native
    def fromAddress(address: String): Iban = js.native
    
    @JSImport("web3-eth-iban", "Iban.fromBban")
    @js.native
    def fromBban(bban: String): Iban = js.native
    
    @JSImport("web3-eth-iban", "Iban.isValid")
    @js.native
    def isValid(iban: String): Boolean = js.native
    
    @JSImport("web3-eth-iban", "Iban.toAddress")
    @js.native
    def toAddress(iban: String): String = js.native
    
    @JSImport("web3-eth-iban", "Iban.toIban")
    @js.native
    def toIban(address: String): String = js.native
  }
  
  @js.native
  trait IndirectOptions extends StObject {
    
    var identifier: String = js.native
    
    var institution: String = js.native
  }
  object IndirectOptions {
    
    @scala.inline
    def apply(identifier: String, institution: String): IndirectOptions = {
      val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], institution = institution.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndirectOptions]
    }
    
    @scala.inline
    implicit class IndirectOptionsMutableBuilder[Self <: IndirectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstitution(value: String): Self = StObject.set(x, "institution", value.asInstanceOf[js.Any])
    }
  }
}
