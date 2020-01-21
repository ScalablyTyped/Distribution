package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents job info for a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactJobInfo")
@js.native
/** Initializes a new instance of a ContactJobInfo class. */
class ContactJobInfo () extends js.Object {
  /** Gets and sets the company address of the job info for a contact. The maximum string length for the company address is 1024 characters. */
  var companyAddress: String = js.native
  /** Gets and sets the company name of the job info for a contact. The maximum string length for the company name is 64 characters. */
  var companyName: String = js.native
  /** Gets and sets the company Yomi (phonetic Japanese equivalent) name of the job info for a contact. The maximum string length for the company Yomi name is 200 characters. */
  var companyYomiName: String = js.native
  /** Gets and sets the department of the job info for a contact. The maximum string length for the department is 100 characters. */
  var department: String = js.native
  /** Gets and sets the description of the job info for a contact. The maximum string length for the description is 512 characters. */
  var description: String = js.native
  /** Gets and sets the manager of the job info for a contact. The maximum string length for the manager is 1024 characters. */
  var manager: String = js.native
  /** Gets and sets the office of the job info for a contact. The maximum string length for the office is 40 characters. */
  var office: String = js.native
  /** Gets and sets the title of the job info for a contact. The maximum string length for the title is 1024 characters. */
  var title: String = js.native
}

