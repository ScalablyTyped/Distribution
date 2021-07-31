package typings.validator.mod.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsISO8601Options extends StObject {
  
  /**
    * If `strict` is `true`, performs additional checks for valid dates,
    * e.g. invalidates dates like `2009-02-29`.
    *
    * @default false
    */
  var strict: js.UndefOr[Boolean] = js.undefined
}
object IsISO8601Options {
  
  @scala.inline
  def apply(): IsISO8601Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsISO8601Options]
  }
  
  @scala.inline
  implicit class IsISO8601OptionsMutableBuilder[Self <: IsISO8601Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
