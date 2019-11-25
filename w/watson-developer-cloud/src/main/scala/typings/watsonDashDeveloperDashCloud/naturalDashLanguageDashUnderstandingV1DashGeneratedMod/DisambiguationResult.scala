package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashUnderstandingV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Disambiguation information for the entity. */
trait DisambiguationResult extends js.Object {
  /** Link to the corresponding DBpedia resource. */
  var dbpedia_resource: js.UndefOr[String] = js.undefined
  /** Common entity name. */
  var name: js.UndefOr[String] = js.undefined
  /** Entity subtype information. */
  var subtype: js.UndefOr[js.Array[String]] = js.undefined
}

object DisambiguationResult {
  @scala.inline
  def apply(dbpedia_resource: String = null, name: String = null, subtype: js.Array[String] = null): DisambiguationResult = {
    val __obj = js.Dynamic.literal()
    if (dbpedia_resource != null) __obj.updateDynamic("dbpedia_resource")(dbpedia_resource.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (subtype != null) __obj.updateDynamic("subtype")(subtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisambiguationResult]
  }
}

