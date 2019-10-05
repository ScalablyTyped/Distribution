package typings.vexflow

import typings.vexflow.Vex.Flow.Annotation.Justify
import typings.vexflow.Vex.Flow.Annotation.VerticalJustify
import typings.vexflow.Vex.Flow.Curve.Position
import typings.vexflow.Vex.Flow.PedalMarking.Styles
import typings.vexflow.Vex.Flow.Renderer.Backends
import typings.vexflow.Vex.Flow.Renderer.LineEndType
import typings.vexflow.Vex.Flow.StaveLine.TextJustification
import typings.vexflow.Vex.Flow.StaveLine.TextVerticalPosition
import typings.vexflow.Vex.Flow.Stroke.Type
import typings.vexflow.Vex.Flow.TextBracket.Positions
import typings.vexflow.Vex.Flow.TextNote.Justification
import typings.vexflow.Vex.Flow.Voice.Mode
import typings.vexflow.Vex.Flow.Volta.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object vexflowNumbers {
  @js.native
  sealed trait `-1` extends Positions
  
  @js.native
  sealed trait `0`
    extends Backends
       with Justification
       with Justify
       with LineEndType
       with Mode
       with Position
       with typings.vexflow.Vex.Flow.Modifier.Position
       with Styles
       with TextJustification
       with TextVerticalPosition
       with Type
       with VerticalJustify
       with `type`
       with typings.vexflow.Vex.Flow.Repetition.`type`
       with typings.vexflow.Vex.Flow.StaveConnector.`type`
       with typings.vexflow.Vex.Flow.Barline.`type`
       with typings.vexflow.Vex.Flow.StaveHairpin.`type`
  
  @js.native
  sealed trait `1`
    extends Backends
       with Justification
       with Justify
       with LineEndType
       with Mode
       with Position
       with typings.vexflow.Vex.Flow.Modifier.Position
       with typings.vexflow.Vex.Flow.StaveModifier.Position
       with Positions
       with Styles
       with TextJustification
       with TextVerticalPosition
       with Type
       with VerticalJustify
       with `type`
       with typings.vexflow.Vex.Flow.Repetition.`type`
       with typings.vexflow.Vex.Flow.StaveConnector.`type`
       with typings.vexflow.Vex.Flow.Barline.`type`
       with typings.vexflow.Vex.Flow.StaveHairpin.`type`
  
  @js.native
  sealed trait `10`
    extends typings.vexflow.Vex.Flow.Repetition.`type`
  
  @js.native
  sealed trait `2`
    extends Backends
       with Justify
       with typings.vexflow.Vex.Flow.Modifier.Position
       with typings.vexflow.Vex.Flow.StaveModifier.Position
       with Type
       with VerticalJustify
       with `type`
       with typings.vexflow.Vex.Flow.Repetition.`type`
       with typings.vexflow.Vex.Flow.StaveConnector.`type`
       with typings.vexflow.Vex.Flow.Barline.`type`
  
  @js.native
  sealed trait `3`
    extends typings.vexflow.Vex.Flow.StaveModifier.Position
       with Type
       with `type`
       with typings.vexflow.Vex.Flow.Repetition.`type`
       with typings.vexflow.Vex.Flow.StaveConnector.`type`
       with typings.vexflow.Vex.Flow.Barline.`type`
  
  @js.native
  sealed trait `4`
    extends typings.vexflow.Vex.Flow.StaveModifier.Position
       with Type
       with typings.vexflow.Vex.Flow.Repetition.`type`
       with typings.vexflow.Vex.Flow.StaveConnector.`type`
       with typings.vexflow.Vex.Flow.Barline.`type`
  
  @js.native
  sealed trait `5`
    extends typings.vexflow.Vex.Flow.StaveModifier.Position
       with Type
       with typings.vexflow.Vex.Flow.Repetition.`type`
       with typings.vexflow.Vex.Flow.StaveConnector.`type`
       with typings.vexflow.Vex.Flow.Barline.`type`
  
  @js.native
  sealed trait `6`
    extends typings.vexflow.Vex.Flow.StaveModifier.Position
       with typings.vexflow.Vex.Flow.Repetition.`type`
       with typings.vexflow.Vex.Flow.StaveConnector.`type`
  
  @js.native
  sealed trait `7`
    extends typings.vexflow.Vex.Flow.Repetition.`type`
       with typings.vexflow.Vex.Flow.StaveConnector.`type`
  
  @js.native
  sealed trait `8`
    extends typings.vexflow.Vex.Flow.Repetition.`type`
       with typings.vexflow.Vex.Flow.StaveConnector.`type`
  
  @js.native
  sealed trait `9`
    extends typings.vexflow.Vex.Flow.Repetition.`type`
  
  @scala.inline
  def `-1`: `-1` = -1.asInstanceOf[`-1`]
  @scala.inline
  def `0`: `0` = 0.asInstanceOf[`0`]
  @scala.inline
  def `1`: `1` = 1.asInstanceOf[`1`]
  @scala.inline
  def `10`: `10` = 10.asInstanceOf[`10`]
  @scala.inline
  def `2`: `2` = 2.asInstanceOf[`2`]
  @scala.inline
  def `3`: `3` = 3.asInstanceOf[`3`]
  @scala.inline
  def `4`: `4` = 4.asInstanceOf[`4`]
  @scala.inline
  def `5`: `5` = 5.asInstanceOf[`5`]
  @scala.inline
  def `6`: `6` = 6.asInstanceOf[`6`]
  @scala.inline
  def `7`: `7` = 7.asInstanceOf[`7`]
  @scala.inline
  def `8`: `8` = 8.asInstanceOf[`8`]
  @scala.inline
  def `9`: `9` = 9.asInstanceOf[`9`]
}

