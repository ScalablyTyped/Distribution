package typings.thunderbirdWebextBrowser.browser

import typings.thunderbirdWebextBrowser.browser.folders.MailFolder
import typings.thunderbirdWebextBrowser.browser.identities.MailIdentity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accounts {
  
  trait MailAccount extends StObject {
    
    /** The folders for this account are only included if requested. */
    var folders: js.UndefOr[js.Array[MailFolder]] = js.undefined
    
    /** A unique identifier for this account. */
    var id: String
    
    /**
      * The identities associated with this account. The default identity is
      * listed first, others in no particular order.
      */
    var identities: js.Array[MailIdentity]
    
    /** The human-friendly name of this account. */
    var name: String
    
    /** What sort of account this is, e.g. `imap`, `nntp`, or `pop3`. */
    var `type`: String
  }
  object MailAccount {
    
    inline def apply(id: String, identities: js.Array[MailIdentity], name: String, `type`: String): MailAccount = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], identities = identities.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MailAccount]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MailAccount] (val x: Self) extends AnyVal {
      
      inline def setFolders(value: js.Array[MailFolder]): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
      
      inline def setFoldersUndefined: Self = StObject.set(x, "folders", js.undefined)
      
      inline def setFoldersVarargs(value: MailFolder*): Self = StObject.set(x, "folders", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdentities(value: js.Array[MailIdentity]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
      
      inline def setIdentitiesVarargs(value: MailIdentity*): Self = StObject.set(x, "identities", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnUpdatedChangedValues extends StObject {
    
    /** The default identity of this account. */
    var defaultIdentity: MailIdentity
    
    /** The human-friendly name of this account. */
    var name: String
  }
  object OnUpdatedChangedValues {
    
    inline def apply(defaultIdentity: MailIdentity, name: String): OnUpdatedChangedValues = {
      val __obj = js.Dynamic.literal(defaultIdentity = defaultIdentity.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnUpdatedChangedValues]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnUpdatedChangedValues] (val x: Self) extends AnyVal {
      
      inline def setDefaultIdentity(value: MailIdentity): Self = StObject.set(x, "defaultIdentity", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
