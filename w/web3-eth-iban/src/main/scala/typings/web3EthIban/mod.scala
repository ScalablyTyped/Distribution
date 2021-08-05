package typings.web3EthIban

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("web3-eth-iban", "Iban")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createIndirect(options: IndirectOptions): Iban = ^.asInstanceOf[js.Dynamic].applyDynamic("createIndirect")(options.asInstanceOf[js.Any]).asInstanceOf[Iban]
    
    inline def fromAddress(address: String): Iban = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAddress")(address.asInstanceOf[js.Any]).asInstanceOf[Iban]
    
    inline def fromBban(bban: String): Iban = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBban")(bban.asInstanceOf[js.Any]).asInstanceOf[Iban]
    
    inline def isValid(iban: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(iban.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def toAddress(iban: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toAddress")(iban.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def toIban(address: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toIban")(address.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  trait IndirectOptions extends StObject {
    
    var identifier: String
    
    var institution: String
  }
  object IndirectOptions {
    
    inline def apply(identifier: String, institution: String): IndirectOptions = {
      val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], institution = institution.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndirectOptions]
    }
    
    extension [Self <: IndirectOptions](x: Self) {
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setInstitution(value: String): Self = StObject.set(x, "institution", value.asInstanceOf[js.Any])
    }
  }
}
