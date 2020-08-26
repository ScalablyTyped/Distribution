package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The comparison of the two submitted documents. */
@js.native
trait CompareReturn extends js.Object {
  /** A list of pairs of elements that semantically align between the compared documents. */
  var aligned_elements: js.UndefOr[js.Array[AlignedElement]] = js.native
  /** Information about the documents being compared. */
  var documents: js.UndefOr[js.Array[Document]] = js.native
  /** The analysis model used to compare the input documents. For the **Compare two documents** method, the only valid value is `contracts`. */
  var model_id: js.UndefOr[String] = js.native
  /** The version of the analysis model identified by the value of the `model_id` key. */
  var model_version: js.UndefOr[String] = js.native
  /** A list of elements that do not semantically align between the compared documents. */
  var unaligned_elements: js.UndefOr[js.Array[UnalignedElement]] = js.native
}

object CompareReturn {
  @scala.inline
  def apply(): CompareReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompareReturn]
  }
  @scala.inline
  implicit class CompareReturnOps[Self <: CompareReturn] (val x: Self) extends AnyVal {
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
    def setAligned_elementsVarargs(value: AlignedElement*): Self = this.set("aligned_elements", js.Array(value :_*))
    @scala.inline
    def setAligned_elements(value: js.Array[AlignedElement]): Self = this.set("aligned_elements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAligned_elements: Self = this.set("aligned_elements", js.undefined)
    @scala.inline
    def setDocumentsVarargs(value: Document*): Self = this.set("documents", js.Array(value :_*))
    @scala.inline
    def setDocuments(value: js.Array[Document]): Self = this.set("documents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocuments: Self = this.set("documents", js.undefined)
    @scala.inline
    def setModel_id(value: String): Self = this.set("model_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel_id: Self = this.set("model_id", js.undefined)
    @scala.inline
    def setModel_version(value: String): Self = this.set("model_version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel_version: Self = this.set("model_version", js.undefined)
    @scala.inline
    def setUnaligned_elementsVarargs(value: UnalignedElement*): Self = this.set("unaligned_elements", js.Array(value :_*))
    @scala.inline
    def setUnaligned_elements(value: js.Array[UnalignedElement]): Self = this.set("unaligned_elements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnaligned_elements: Self = this.set("unaligned_elements", js.undefined)
  }
  
}

