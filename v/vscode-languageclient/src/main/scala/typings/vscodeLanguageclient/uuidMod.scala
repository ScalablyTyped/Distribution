package typings.vscodeLanguageclient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uuidMod {
  
  @JSImport("vscode-languageclient/lib/utils/uuid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode-languageclient/lib/utils/uuid", "empty")
  @js.native
  val empty: UUID = js.native
  
  @scala.inline
  def generateUuid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateUuid")().asInstanceOf[String]
  
  @scala.inline
  def isUUID(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUUID")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def parse(value: String): UUID = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(value.asInstanceOf[js.Any]).asInstanceOf[UUID]
  
  @scala.inline
  def v4(): UUID = ^.asInstanceOf[js.Dynamic].applyDynamic("v4")().asInstanceOf[UUID]
  
  trait UUID extends StObject {
    
    /**
      * @returns the canonical representation in sets of hexadecimal numbers separated by dashes.
      */
    def asHex(): String
    
    def equals(other: UUID): Boolean
  }
  object UUID {
    
    @scala.inline
    def apply(asHex: () => String, equals_ : UUID => Boolean): UUID = {
      val __obj = js.Dynamic.literal(asHex = js.Any.fromFunction0(asHex))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[UUID]
    }
    
    @scala.inline
    implicit class UUIDMutableBuilder[Self <: UUID] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsHex(value: () => String): Self = StObject.set(x, "asHex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEquals_(value: UUID => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    }
  }
}
