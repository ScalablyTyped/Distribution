package typings.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ParameterInformation {
  
  @JSImport("vscode-languageclient", "ParameterInformation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new parameter information literal.
    *
    * @param label A label string.
    * @param documentation A doc string.
    */
  @scala.inline
  def create(label: String): typings.vscodeLanguageserverTypes.mod.ParameterInformation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any]).asInstanceOf[typings.vscodeLanguageserverTypes.mod.ParameterInformation]
  @scala.inline
  def create(label: String, documentation: String): typings.vscodeLanguageserverTypes.mod.ParameterInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any], documentation.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.ParameterInformation]
  @scala.inline
  def create(label: js.Tuple2[Double, Double]): typings.vscodeLanguageserverTypes.mod.ParameterInformation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any]).asInstanceOf[typings.vscodeLanguageserverTypes.mod.ParameterInformation]
  @scala.inline
  def create(label: js.Tuple2[Double, Double], documentation: String): typings.vscodeLanguageserverTypes.mod.ParameterInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any], documentation.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.ParameterInformation]
}
