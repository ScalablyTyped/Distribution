package typings.vexflow.Vex.Flow

import typings.vexflow.anon.Extraleftpx
import typings.vexflow.anon.Leftshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifierContext extends StObject {
  
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
  implicit class ModifierContextMutableBuilder[Self <: ModifierContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddModifier(value: Modifier => ModifierContext): Self = StObject.set(x, "addModifier", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetExtraLeftPx(value: () => Double): Self = StObject.set(x, "getExtraLeftPx", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExtraRightPx(value: () => Double): Self = StObject.set(x, "getExtraRightPx", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMetrics(value: () => Extraleftpx): Self = StObject.set(x, "getMetrics", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetModifiers(value: String => js.Array[Modifier]): Self = StObject.set(x, "getModifiers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => Leftshift): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPostFormat(value: () => Unit): Self = StObject.set(x, "postFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreFormat(value: () => Unit): Self = StObject.set(x, "preFormat", js.Any.fromFunction0(value))
  }
}
