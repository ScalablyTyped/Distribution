package typings
package wonderDotJsLib.distEs2015StructureViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/structure/View", "ViewWebGL")
@js.native
class ViewWebGL protected () extends IView {
  def this(dom: js.Any) = this()
  /* CompleteClass */
  override var dom: js.Any = js.native
  /* CompleteClass */
  override var height: scala.Double = js.native
  /* CompleteClass */
  override var offset: wonderDotJsLib.Anon_XY = js.native
  @JSName("offset")
  val offset_ViewWebGL: wonderDotJsLib.Anon_X = js.native
  /* CompleteClass */
  override var styleHeight: java.lang.String = js.native
  /* CompleteClass */
  override var styleWidth: java.lang.String = js.native
  /* CompleteClass */
  override var width: scala.Double = js.native
  /* CompleteClass */
  override var x: scala.Double = js.native
  /* CompleteClass */
  override var y: scala.Double = js.native
  /* CompleteClass */
  override def getContext(contextConfig: wonderDotJsLib.distEs2015CoreDataMainDataMod.ContextConfigData): stdLib.WebGLRenderingContext = js.native
  /* CompleteClass */
  override def initCanvas(): scala.Unit = js.native
}

@JSImport("wonder.js/dist/es2015/structure/View", "ViewWebGL")
@js.native
object ViewWebGL extends js.Object {
  def create(view: js.Any): wonderDotJsLib.distEs2015StructureViewMod.ViewWebGL = js.native
}

