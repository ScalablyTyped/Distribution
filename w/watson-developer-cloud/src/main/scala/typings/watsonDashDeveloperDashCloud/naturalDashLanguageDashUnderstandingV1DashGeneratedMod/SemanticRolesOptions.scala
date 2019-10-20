package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashUnderstandingV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parses sentences into subject, action, and object form. Supported languages: English, German, Japanese, Korean, Spanish. */
trait SemanticRolesOptions extends js.Object {
  /** Set this to `true` to return entity information for subjects and objects. */
  var entities: js.UndefOr[Boolean] = js.undefined
  /** Set this to `true` to return keyword information for subjects and objects. */
  var keywords: js.UndefOr[Boolean] = js.undefined
  /** Maximum number of semantic_roles results to return. */
  var limit: js.UndefOr[Double] = js.undefined
}

object SemanticRolesOptions {
  @scala.inline
  def apply(
    entities: js.UndefOr[Boolean] = js.undefined,
    keywords: js.UndefOr[Boolean] = js.undefined,
    limit: Int | Double = null
  ): SemanticRolesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entities)) __obj.updateDynamic("entities")(entities)
    if (!js.isUndefined(keywords)) __obj.updateDynamic("keywords")(keywords)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticRolesOptions]
  }
}

