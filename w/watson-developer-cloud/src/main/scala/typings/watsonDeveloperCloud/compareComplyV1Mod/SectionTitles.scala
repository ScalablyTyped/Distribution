package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An array containing one object per section or subsection detected in the input document. Sections and subsections are not nested; instead, they are flattened out and can be placed back in order by using the `begin` and `end` values of the element and the `level` value of the section. */
@js.native
trait SectionTitles extends js.Object {
  /** An array of `location` objects that lists the locations of detected section titles. */
  var element_locations: js.UndefOr[js.Array[ElementLocations]] = js.native
  /** An integer indicating the level at which the section is located in the input document. For example, `1` represents a top-level section, `2` represents a subsection within the level `1` section, and so forth. */
  var level: js.UndefOr[Double] = js.native
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.native
  /** The text of the section title, if identified. */
  var text: js.UndefOr[String] = js.native
}

object SectionTitles {
  @scala.inline
  def apply(): SectionTitles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionTitles]
  }
  @scala.inline
  implicit class SectionTitlesOps[Self <: SectionTitles] (val x: Self) extends AnyVal {
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
    def setElement_locationsVarargs(value: ElementLocations*): Self = this.set("element_locations", js.Array(value :_*))
    @scala.inline
    def setElement_locations(value: js.Array[ElementLocations]): Self = this.set("element_locations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement_locations: Self = this.set("element_locations", js.undefined)
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

