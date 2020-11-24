package typings.xrm.Xrm.Url

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for defining parameters of a request to open a dialog with rundialog.aspx (as with
  * window.open).  Useful for parsing the keys and values into a string of the format:
  * "&key=value".
  * @see {@link http://msdn.microsoft.com/en-us/library/gg328483.aspx External Link: Open forms, views, dialogs, and reports with a URL}
  */
@js.native
trait DialogOpenParameters extends js.Object {
  
  /**
    * The unique identifier of the dialog, in Guid format, which is valid for the entity described
    * by: {@link EntityName}
    */
  var DialogId: String = js.native
  
  /**
    * The logical name of the entity.
    */
  var EntityName: String = js.native
  
  /**
    * The unique identifier for the targeted record.
    */
  var ObjectId: String = js.native
}
object DialogOpenParameters {
  
  @scala.inline
  def apply(DialogId: String, EntityName: String, ObjectId: String): DialogOpenParameters = {
    val __obj = js.Dynamic.literal(DialogId = DialogId.asInstanceOf[js.Any], EntityName = EntityName.asInstanceOf[js.Any], ObjectId = ObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogOpenParameters]
  }
  
  @scala.inline
  implicit class DialogOpenParametersOps[Self <: DialogOpenParameters] (val x: Self) extends AnyVal {
    
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
    def setDialogId(value: String): Self = this.set("DialogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityName(value: String): Self = this.set("EntityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectId(value: String): Self = this.set("ObjectId", value.asInstanceOf[js.Any])
  }
}
