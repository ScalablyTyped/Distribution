package typings.winkPosTagger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.winkPosTagger.winkPosTaggerStrings.PRP
  - typings.winkPosTagger.winkPosTaggerStrings.VBD
  - typings.winkPosTagger.winkPosTaggerStrings.DT
  - typings.winkPosTagger.winkPosTaggerStrings.JJ
  - typings.winkPosTagger.winkPosTaggerStrings.NN
  - typings.winkPosTagger.winkPosTaggerStrings.IN
  - typings.winkPosTagger.winkPosTaggerStrings.VBG
  - typings.winkPosTagger.winkPosTaggerStrings.Dot
*/
trait PosTag extends js.Object

object PosTag {
  @scala.inline
  def DT: typings.winkPosTagger.winkPosTaggerStrings.DT = this.cast("DT")
  @scala.inline
  def Dot: typings.winkPosTagger.winkPosTaggerStrings.Dot = this.cast(".")
  @scala.inline
  def IN: typings.winkPosTagger.winkPosTaggerStrings.IN = this.cast("IN")
  @scala.inline
  def JJ: typings.winkPosTagger.winkPosTaggerStrings.JJ = this.cast("JJ")
  @scala.inline
  def NN: typings.winkPosTagger.winkPosTaggerStrings.NN = this.cast("NN")
  @scala.inline
  def PRP: typings.winkPosTagger.winkPosTaggerStrings.PRP = this.cast("PRP")
  @scala.inline
  def VBD: typings.winkPosTagger.winkPosTaggerStrings.VBD = this.cast("VBD")
  @scala.inline
  def VBG: typings.winkPosTagger.winkPosTaggerStrings.VBG = this.cast("VBG")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

