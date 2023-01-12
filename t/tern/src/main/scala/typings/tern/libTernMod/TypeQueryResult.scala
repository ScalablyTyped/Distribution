package typings.tern.libTernMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeQueryResult extends StObject {
  
  /** If the type had documentation associated with it, these will also be returned. */
  var doc: js.UndefOr[String] = js.undefined
  
  /** When the inspected expression was an identifier or a property access, this will hold the name of the variable or property. */
  var exprName: js.UndefOr[String] = js.undefined
  
  /** Whether the given type was guessed, or should be considered reliable. */
  var guess: Boolean
  
  /** The name associated with the type. */
  var name: js.UndefOr[String] = js.undefined
  
  /** If the type had origin information associated with it, these will also be returned. */
  var origin: js.UndefOr[String] = js.undefined
  
  /** A description of the type of the value. May be "?" when no type was found. */
  var `type`: String
  
  /** If the type had urls associated with it, these will also be returned. */
  var url: js.UndefOr[String] = js.undefined
}
object TypeQueryResult {
  
  inline def apply(guess: Boolean, `type`: String): TypeQueryResult = {
    val __obj = js.Dynamic.literal(guess = guess.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeQueryResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeQueryResult] (val x: Self) extends AnyVal {
    
    inline def setDoc(value: String): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    inline def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
    
    inline def setExprName(value: String): Self = StObject.set(x, "exprName", value.asInstanceOf[js.Any])
    
    inline def setExprNameUndefined: Self = StObject.set(x, "exprName", js.undefined)
    
    inline def setGuess(value: Boolean): Self = StObject.set(x, "guess", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
