package typings.winrt.Windows.Data.Json

import typings.winrt.anon.Succeeded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IJsonObjectStatics extends StObject {
  
  def parse(input: String): JsonObject = js.native
  
  def tryParse(input: String): Succeeded = js.native
}
object IJsonObjectStatics {
  
  @scala.inline
  def apply(parse: String => JsonObject, tryParse: String => Succeeded): IJsonObjectStatics = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), tryParse = js.Any.fromFunction1(tryParse))
    __obj.asInstanceOf[IJsonObjectStatics]
  }
  
  @scala.inline
  implicit class IJsonObjectStaticsMutableBuilder[Self <: IJsonObjectStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParse(value: String => JsonObject): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTryParse(value: String => Succeeded): Self = StObject.set(x, "tryParse", js.Any.fromFunction1(value))
  }
}
