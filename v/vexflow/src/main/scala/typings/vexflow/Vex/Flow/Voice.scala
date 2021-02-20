package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.Flow.Voice.Mode
import typings.vexflow.Vex.IRenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Voice extends StObject {
  
  def addTickable(tickable: Tickable): Voice = js.native
  
  def addTickables(tickables: js.Array[Tickable]): Voice = js.native
  
  def draw(context: IRenderContext): Unit = js.native
  def draw(context: IRenderContext, stave: Stave): Unit = js.native
  
  def getActualResolution(): Double = js.native
  
  def getBoundingBox(): BoundingBox = js.native
  
  def getLargestTickWidth(): Double = js.native
  
  def getMode(): Mode = js.native
  
  def getResolutionMultiplier(): Double = js.native
  
  def getSmallestTickCount(): Fraction = js.native
  
  def getTickables(): js.Array[Tickable] = js.native
  
  def getTicksUsed(): Fraction = js.native
  
  def getTotalTicks(): Fraction = js.native
  
  def getVoiceGroup(): VoiceGroup = js.native
  
  def isComplete(): Boolean = js.native
  
  def preFormat(): Voice = js.native
  
  def setMode(mode: Mode): Voice = js.native
  
  def setStave(stave: Stave): Voice = js.native
  
  def setStrict(strict: Boolean): Voice = js.native
  
  def setVoiceGroup(g: VoiceGroup): Voice = js.native
}
object Voice {
  
  @js.native
  sealed trait Mode extends StObject
  @JSGlobal("Vex.Flow.Voice.Mode")
  @js.native
  object Mode extends StObject {
    
    @js.native
    sealed trait FULL extends Mode
    
    @js.native
    sealed trait SOFT extends Mode
    
    @js.native
    sealed trait STRICT extends Mode
  }
}
