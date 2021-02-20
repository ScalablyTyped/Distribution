package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Formatter extends StObject {
  
  def alignRests(voices: js.Array[Voice], align_all_notes: Boolean): Unit = js.native
  
  def createModifierContexts(voices: js.Array[Voice]): js.Array[ModifierContext] = js.native
  
  def createTickContexts(voices: js.Array[Voice]): js.Array[TickContext] = js.native
  
  def format(voices: js.Array[Voice], justifyWidth: Double): Formatter = js.native
  def format(voices: js.Array[Voice], justifyWidth: Double, options: Context): Formatter = js.native
  
  def formatToStave(voices: js.Array[Voice], stave: Stave): Formatter = js.native
  def formatToStave(voices: js.Array[Voice], stave: Stave, options: Context): Formatter = js.native
  
  def getMinTotalWidth(): Double = js.native
  
  def joinVoices(voices: js.Array[Voice]): Formatter = js.native
  
  def postFormat(): Formatter = js.native
  
  def preCalculateMinTotalWidth(voices: js.Array[Voice]): Double = js.native
  
  def preFormat(): Unit = js.native
  def preFormat(
    justifyWidth: js.UndefOr[scala.Nothing],
    rendering_context: js.UndefOr[scala.Nothing],
    voices: js.UndefOr[scala.Nothing],
    stave: Stave
  ): Unit = js.native
  def preFormat(
    justifyWidth: js.UndefOr[scala.Nothing],
    rendering_context: js.UndefOr[scala.Nothing],
    voices: js.Array[Voice]
  ): Unit = js.native
  def preFormat(
    justifyWidth: js.UndefOr[scala.Nothing],
    rendering_context: js.UndefOr[scala.Nothing],
    voices: js.Array[Voice],
    stave: Stave
  ): Unit = js.native
  def preFormat(justifyWidth: js.UndefOr[scala.Nothing], rendering_context: IRenderContext): Unit = js.native
  def preFormat(
    justifyWidth: js.UndefOr[scala.Nothing],
    rendering_context: IRenderContext,
    voices: js.UndefOr[scala.Nothing],
    stave: Stave
  ): Unit = js.native
  def preFormat(
    justifyWidth: js.UndefOr[scala.Nothing],
    rendering_context: IRenderContext,
    voices: js.Array[Voice]
  ): Unit = js.native
  def preFormat(
    justifyWidth: js.UndefOr[scala.Nothing],
    rendering_context: IRenderContext,
    voices: js.Array[Voice],
    stave: Stave
  ): Unit = js.native
  def preFormat(justifyWidth: Double): Unit = js.native
  def preFormat(
    justifyWidth: Double,
    rendering_context: js.UndefOr[scala.Nothing],
    voices: js.UndefOr[scala.Nothing],
    stave: Stave
  ): Unit = js.native
  def preFormat(justifyWidth: Double, rendering_context: js.UndefOr[scala.Nothing], voices: js.Array[Voice]): Unit = js.native
  def preFormat(
    justifyWidth: Double,
    rendering_context: js.UndefOr[scala.Nothing],
    voices: js.Array[Voice],
    stave: Stave
  ): Unit = js.native
  def preFormat(justifyWidth: Double, rendering_context: IRenderContext): Unit = js.native
  def preFormat(
    justifyWidth: Double,
    rendering_context: IRenderContext,
    voices: js.UndefOr[scala.Nothing],
    stave: Stave
  ): Unit = js.native
  def preFormat(justifyWidth: Double, rendering_context: IRenderContext, voices: js.Array[Voice]): Unit = js.native
  def preFormat(justifyWidth: Double, rendering_context: IRenderContext, voices: js.Array[Voice], stave: Stave): Unit = js.native
}
