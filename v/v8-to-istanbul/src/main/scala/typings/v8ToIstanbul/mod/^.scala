package typings.v8ToIstanbul.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("v8-to-istanbul", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(scriptPath: String): V8ToIstanbul = js.native
  def apply(
    scriptPath: String,
    wrapperLength: js.UndefOr[scala.Nothing],
    sources: js.UndefOr[scala.Nothing],
    excludePath: js.Function1[/* path */ String, Boolean]
  ): V8ToIstanbul = js.native
  def apply(scriptPath: String, wrapperLength: js.UndefOr[scala.Nothing], sources: Sources): V8ToIstanbul = js.native
  def apply(
    scriptPath: String,
    wrapperLength: js.UndefOr[scala.Nothing],
    sources: Sources,
    excludePath: js.Function1[/* path */ String, Boolean]
  ): V8ToIstanbul = js.native
  def apply(scriptPath: String, wrapperLength: Double): V8ToIstanbul = js.native
  def apply(
    scriptPath: String,
    wrapperLength: Double,
    sources: js.UndefOr[scala.Nothing],
    excludePath: js.Function1[/* path */ String, Boolean]
  ): V8ToIstanbul = js.native
  def apply(scriptPath: String, wrapperLength: Double, sources: Sources): V8ToIstanbul = js.native
  def apply(
    scriptPath: String,
    wrapperLength: Double,
    sources: Sources,
    excludePath: js.Function1[/* path */ String, Boolean]
  ): V8ToIstanbul = js.native
}
