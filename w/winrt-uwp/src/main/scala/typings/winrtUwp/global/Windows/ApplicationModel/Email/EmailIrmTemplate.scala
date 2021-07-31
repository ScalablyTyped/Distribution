package typings.winrtUwp.global.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a template that can be used to create new EmailIrmInfo objects. */
@JSGlobal("Windows.ApplicationModel.Email.EmailIrmTemplate")
@js.native
/** Creates a new instance of the EmailIrmTemplate class. */
class EmailIrmTemplate ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Email.EmailIrmTemplate {
  /**
    * Creates a new instance of the EmailIrmTemplate class with the specified ID, name and description.
    * @param id The ID for the new template.
    * @param name The name of the new template.
    * @param description The description of the new template.
    */
  def this(id: String, name: String, description: String) = this()
  
  /** Gets or sets the description of the template. */
  /* CompleteClass */
  var description: String = js.native
  
  /** Gets or sets the ID for the template. */
  /* CompleteClass */
  var id: String = js.native
  
  /** Gets or sets the name for the template. */
  /* CompleteClass */
  var name: String = js.native
}
