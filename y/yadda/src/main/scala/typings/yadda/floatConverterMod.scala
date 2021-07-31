package typings.yadda

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object floatConverterMod {
  
  @scala.inline
  def apply(value: String, next: js.Function2[/* err */ Error | Null, /* value */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("yadda/lib/converters/float-converter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
