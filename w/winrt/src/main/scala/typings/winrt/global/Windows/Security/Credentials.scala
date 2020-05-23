package typings.winrt.global.Windows.Security

import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IPropertySet
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol
import typings.winrt.Windows.Security.Credentials.UI.CredentialSaveOption
import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Credentials")
@js.native
object Credentials extends js.Object {
  @js.native
  class PasswordCredential ()
    extends typings.winrt.Windows.Security.Credentials.PasswordCredential {
    def this(resource: String, userName: String, password: String) = this()
    /* CompleteClass */
    override var password: String = js.native
    /* CompleteClass */
    override var properties: IPropertySet = js.native
    /* CompleteClass */
    override var resource: String = js.native
    /* CompleteClass */
    override var userName: String = js.native
    /* CompleteClass */
    override def retrievePassword(): Unit = js.native
  }
  
  @js.native
  class PasswordCredentialPropertyStore ()
    extends typings.winrt.Windows.Security.Credentials.PasswordCredentialPropertyStore {
    /* CompleteClass */
    override var onmapchanged: js.Any = js.native
    /* CompleteClass */
    override var size: Double = js.native
    /* CompleteClass */
    override def clear(): Unit = js.native
    /* CompleteClass */
    override def first(): IIterator[IKeyValuePair[String, js.Any]] = js.native
    /* CompleteClass */
    override def getView(): IMapView[String, js.Any] = js.native
    /* CompleteClass */
    override def hasKey(key: String): Boolean = js.native
    /* CompleteClass */
    override def insert(key: String, value: js.Any): Boolean = js.native
    /* CompleteClass */
    override def lookup(key: String): js.Any = js.native
    /* CompleteClass */
    override def remove(key: String): Unit = js.native
  }
  
  @js.native
  class PasswordVault ()
    extends typings.winrt.Windows.Security.Credentials.PasswordVault {
    /* CompleteClass */
    override def add(credential: typings.winrt.Windows.Security.Credentials.PasswordCredential): Unit = js.native
    /* CompleteClass */
    override def findAllByResource(resource: String): IVectorView[typings.winrt.Windows.Security.Credentials.PasswordCredential] = js.native
    /* CompleteClass */
    override def findAllByUserName(userName: String): IVectorView[typings.winrt.Windows.Security.Credentials.PasswordCredential] = js.native
    /* CompleteClass */
    override def remove(credential: typings.winrt.Windows.Security.Credentials.PasswordCredential): Unit = js.native
    /* CompleteClass */
    override def retrieve(resource: String, userName: String): typings.winrt.Windows.Security.Credentials.PasswordCredential = js.native
    /* CompleteClass */
    override def retrieveAll(): IVectorView[typings.winrt.Windows.Security.Credentials.PasswordCredential] = js.native
  }
  
  @js.native
  object UI extends js.Object {
    @js.native
    class CredentialPicker ()
      extends typings.winrt.Windows.Security.Credentials.UI.CredentialPicker
    
    @js.native
    class CredentialPickerOptions ()
      extends typings.winrt.Windows.Security.Credentials.UI.CredentialPickerOptions {
      /* CompleteClass */
      override var alwaysDisplayDialog: Boolean = js.native
      /* CompleteClass */
      override var authenticationProtocol: AuthenticationProtocol = js.native
      /* CompleteClass */
      override var callerSavesCredential: Boolean = js.native
      /* CompleteClass */
      override var caption: String = js.native
      /* CompleteClass */
      override var credentialSaveOption: CredentialSaveOption = js.native
      /* CompleteClass */
      override var customAuthenticationProtocol: String = js.native
      /* CompleteClass */
      override var errorCode: Double = js.native
      /* CompleteClass */
      override var message: String = js.native
      /* CompleteClass */
      override var previousCredential: IBuffer = js.native
      /* CompleteClass */
      override var targetName: String = js.native
    }
    
    @js.native
    class CredentialPickerResults ()
      extends typings.winrt.Windows.Security.Credentials.UI.CredentialPickerResults {
      /* CompleteClass */
      override var credential: IBuffer = js.native
      /* CompleteClass */
      override var credentialDomainName: String = js.native
      /* CompleteClass */
      override var credentialPassword: String = js.native
      /* CompleteClass */
      override var credentialSaveOption: CredentialSaveOption = js.native
      /* CompleteClass */
      override var credentialSaved: Boolean = js.native
      /* CompleteClass */
      override var credentialUserName: String = js.native
      /* CompleteClass */
      override var errorCode: Double = js.native
    }
    
    @js.native
    object AuthenticationProtocol extends js.Object {
      /* 0 */ val basic: typings.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.basic with Double = js.native
      /* 5 */ val credSsp: typings.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.credSsp with Double = js.native
      /* 6 */ val custom: typings.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.custom with Double = js.native
      /* 1 */ val digest: typings.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.digest with Double = js.native
      /* 3 */ val kerberos: typings.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.kerberos with Double = js.native
      /* 4 */ val negotiate: typings.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.negotiate with Double = js.native
      /* 2 */ val ntlm: typings.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.ntlm with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol with Double] = js.native
    }
    
    /* static members */
    @js.native
    object CredentialPicker extends js.Object {
      def pickAsync(options: typings.winrt.Windows.Security.Credentials.UI.CredentialPickerOptions): IAsyncOperation[typings.winrt.Windows.Security.Credentials.UI.CredentialPickerResults] = js.native
      def pickAsync(targetName: String, message: String): IAsyncOperation[typings.winrt.Windows.Security.Credentials.UI.CredentialPickerResults] = js.native
      def pickAsync(targetName: String, message: String, caption: String): IAsyncOperation[typings.winrt.Windows.Security.Credentials.UI.CredentialPickerResults] = js.native
    }
    
    @js.native
    object CredentialSaveOption extends js.Object {
      /* 2 */ val hidden: typings.winrt.Windows.Security.Credentials.UI.CredentialSaveOption.hidden with Double = js.native
      /* 1 */ val selected: typings.winrt.Windows.Security.Credentials.UI.CredentialSaveOption.selected with Double = js.native
      /* 0 */ val unselected: typings.winrt.Windows.Security.Credentials.UI.CredentialSaveOption.unselected with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Security.Credentials.UI.CredentialSaveOption with Double] = js.native
    }
    
  }
  
}

