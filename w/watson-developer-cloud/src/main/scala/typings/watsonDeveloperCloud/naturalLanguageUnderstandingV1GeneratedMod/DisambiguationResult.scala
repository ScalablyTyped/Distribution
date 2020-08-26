package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Disambiguation information for the entity. */
@js.native
trait DisambiguationResult extends js.Object {
  /** Link to the corresponding DBpedia resource. */
  var dbpedia_resource: js.UndefOr[String] = js.native
  /** Common entity name. */
  var name: js.UndefOr[String] = js.native
  /** Entity subtype information. */
  var subtype: js.UndefOr[js.Array[String]] = js.native
}

object DisambiguationResult {
  @scala.inline
  def apply(): DisambiguationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisambiguationResult]
  }
  @scala.inline
  implicit class DisambiguationResultOps[Self <: DisambiguationResult] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSubtypeVarargs(value: String*): Self = this.set("subtype", js.Array(value :_*))
    @scala.inline
    def setSubtype(value: js.Array[String]): Self = this.set("subtype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtype: Self = this.set("subtype", js.undefined)
  }
  
}

