package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The structure of the input document. */
trait DocStructure extends js.Object {
  /** An array containing one object per section or subsection, in parallel with the `section_titles` array, that details the leading sentences in the corresponding section or subsection. */
  var leading_sentences: js.UndefOr[js.Array[LeadingSentence]] = js.undefined
  /** An array containing one object per section or subsection identified in the input document. */
  var section_titles: js.UndefOr[js.Array[SectionTitles]] = js.undefined
}

object DocStructure {
  @scala.inline
  def apply(
    leading_sentences: js.Array[LeadingSentence] = null,
    section_titles: js.Array[SectionTitles] = null
  ): DocStructure = {
    val __obj = js.Dynamic.literal()
    if (leading_sentences != null) __obj.updateDynamic("leading_sentences")(leading_sentences.asInstanceOf[js.Any])
    if (section_titles != null) __obj.updateDynamic("section_titles")(section_titles.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocStructure]
  }
}

