package typings.vexflow.Vex.Flow

import typings.vexflow.anon.Extraleftpx
import typings.vexflow.anon.Leftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifierContext extends js.Object {
  
  def addModifier(modifier: Modifier): ModifierContext = js.native
  
  def getExtraLeftPx(): Double = js.native
  
  def getExtraRightPx(): Double = js.native
  
  def getMetrics(): Extraleftpx = js.native
  
  def getModifiers(`type`: String): js.Array[Modifier] = js.native
  
  def getState(): Leftshift = js.native
  
  def getWidth(): Double = js.native
  
  def postFormat(): Unit = js.native
  
  def preFormat(): Unit = js.native
}
object ModifierContext {
  
  @scala.inline
  def apply(
    addModifier: Modifier => ModifierContext,
    getExtraLeftPx: () => Double,
    getExtraRightPx: () => Double,
    getMetrics: () => Extraleftpx,
    getModifiers: String => js.Array[Modifier],
    getState: () => Leftshift,
    getWidth: () => Double,
    postFormat: () => Unit,
    preFormat: () => Unit
  ): ModifierContext = {
    val __obj = js.Dynamic.literal(addModifier = js.Any.fromFunction1(addModifier), getExtraLeftPx = js.Any.fromFunction0(getExtraLeftPx), getExtraRightPx = js.Any.fromFunction0(getExtraRightPx), getMetrics = js.Any.fromFunction0(getMetrics), getModifiers = js.Any.fromFunction1(getModifiers), getState = js.Any.fromFunction0(getState), getWidth = js.Any.fromFunction0(getWidth), postFormat = js.Any.fromFunction0(postFormat), preFormat = js.Any.fromFunction0(preFormat))
    __obj.asInstanceOf[ModifierContext]
  }
  
  @scala.inline
  implicit class ModifierContextOps[Self <: ModifierContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddModifier(value: Modifier => ModifierContext): Self = this.set("addModifier", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetExtraLeftPx(value: () => Double): Self = this.set("getExtraLeftPx", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExtraRightPx(value: () => Double): Self = this.set("getExtraRightPx", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMetrics(value: () => Extraleftpx): Self = this.set("getMetrics", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetModifiers(value: String => js.Array[Modifier]): Self = this.set("getModifiers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => Leftshift): Self = this.set("getState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWidth(value: () => Double): Self = this.set("getWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPostFormat(value: () => Unit): Self = this.set("postFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreFormat(value: () => Unit): Self = this.set("preFormat", js.Any.fromFunction0(value))
  }
}
