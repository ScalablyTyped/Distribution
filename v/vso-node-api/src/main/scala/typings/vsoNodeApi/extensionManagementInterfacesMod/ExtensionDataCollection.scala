package typings.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionDataCollection extends js.Object {
  /**
    * The name of the collection
    */
  var collectionName: String = js.native
  /**
    * A list of documents belonging to the collection
    */
  var documents: js.Array[_] = js.native
  /**
    * The type of the collection's scope, such as Default or User
    */
  var scopeType: String = js.native
  /**
    * The value of the collection's scope, such as Current or Me
    */
  var scopeValue: String = js.native
}

object ExtensionDataCollection {
  @scala.inline
  def apply(collectionName: String, documents: js.Array[_], scopeType: String, scopeValue: String): ExtensionDataCollection = {
    val __obj = js.Dynamic.literal(collectionName = collectionName.asInstanceOf[js.Any], documents = documents.asInstanceOf[js.Any], scopeType = scopeType.asInstanceOf[js.Any], scopeValue = scopeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionDataCollection]
  }
  @scala.inline
  implicit class ExtensionDataCollectionOps[Self <: ExtensionDataCollection] (val x: Self) extends AnyVal {
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
    def setCollectionName(value: String): Self = this.set("collectionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocumentsVarargs(value: js.Any*): Self = this.set("documents", js.Array(value :_*))
    @scala.inline
    def setDocuments(value: js.Array[_]): Self = this.set("documents", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeType(value: String): Self = this.set("scopeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeValue(value: String): Self = this.set("scopeValue", value.asInstanceOf[js.Any])
  }
  
}

