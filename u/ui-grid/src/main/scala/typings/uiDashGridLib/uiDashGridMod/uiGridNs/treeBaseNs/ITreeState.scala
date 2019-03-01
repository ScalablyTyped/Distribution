package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.treeBaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITreeState extends js.Object {
  var expandedState: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object ITreeState {
  @scala.inline
  def apply(expandedState: org.scalablytyped.runtime.StringDictionary[java.lang.String]): ITreeState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expandedState")(expandedState)
    __obj.asInstanceOf[ITreeState]
  }
}

