package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The structure of the input document. */
@js.native
trait DocStructure extends js.Object {
  /** An array containing one object per section or subsection, in parallel with the `section_titles` array, that details the leading sentences in the corresponding section or subsection. */
  var leading_sentences: js.UndefOr[js.Array[LeadingSentence]] = js.native
  /** An array containing one object per section or subsection identified in the input document. */
  var section_titles: js.UndefOr[js.Array[SectionTitles]] = js.native
}

object DocStructure {
  @scala.inline
  def apply(): DocStructure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocStructure]
  }
  @scala.inline
  implicit class DocStructureOps[Self <: DocStructure] (val x: Self) extends AnyVal {
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
    def setLeading_sentencesVarargs(value: LeadingSentence*): Self = this.set("leading_sentences", js.Array(value :_*))
    @scala.inline
    def setLeading_sentences(value: js.Array[LeadingSentence]): Self = this.set("leading_sentences", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeading_sentences: Self = this.set("leading_sentences", js.undefined)
    @scala.inline
    def setSection_titlesVarargs(value: SectionTitles*): Self = this.set("section_titles", js.Array(value :_*))
    @scala.inline
    def setSection_titles(value: js.Array[SectionTitles]): Self = this.set("section_titles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSection_titles: Self = this.set("section_titles", js.undefined)
  }
  
}

