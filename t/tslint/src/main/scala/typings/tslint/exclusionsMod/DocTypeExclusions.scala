package typings.tslint.exclusionsMod

import typings.tslint.exclusionMod.Exclusion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocTypeExclusions extends js.Object {
  var overloadsSeparateDocs: js.UndefOr[Boolean] = js.undefined
  var requirements: js.Array[Exclusion[_]]
}

object DocTypeExclusions {
  @scala.inline
  def apply(requirements: js.Array[Exclusion[_]], overloadsSeparateDocs: js.UndefOr[Boolean] = js.undefined): DocTypeExclusions = {
    val __obj = js.Dynamic.literal(requirements = requirements.asInstanceOf[js.Any])
    if (!js.isUndefined(overloadsSeparateDocs)) __obj.updateDynamic("overloadsSeparateDocs")(overloadsSeparateDocs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocTypeExclusions]
  }
}

