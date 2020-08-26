package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The general concepts referenced or alluded to in the analyzed text. */
@js.native
trait ConceptsResult extends js.Object {
  /** Link to the corresponding DBpedia resource. */
  var dbpedia_resource: js.UndefOr[String] = js.native
  /** Relevance score between 0 and 1. Higher scores indicate greater relevance. */
  var relevance: js.UndefOr[Double] = js.native
  /** Name of the concept. */
  var text: js.UndefOr[String] = js.native
}

object ConceptsResult {
  @scala.inline
  def apply(): ConceptsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConceptsResult]
  }
  @scala.inline
  implicit class ConceptsResultOps[Self <: ConceptsResult] (val x: Self) extends AnyVal {
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
    def setDbpedia_resource(value: String): Self = this.set("dbpedia_resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDbpedia_resource: Self = this.set("dbpedia_resource", js.undefined)
    @scala.inline
    def setRelevance(value: Double): Self = this.set("relevance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelevance: Self = this.set("relevance", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

