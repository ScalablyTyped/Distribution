package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  * Application-wide service for handling modals, overlays and dialogs By default it
  * injects the passed template url into a div to body of the document And renders it,
  * but does also support rendering items in an iframe, incase serverside processing is needed, or its a non-angular page
  */
@js.native
trait IDialogService extends StObject {
  
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#close
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Closes a specific dialog
    * @param {Object} dialog the dialog object to close
    * @param {Object} args if specified this object will be sent to any callbacks registered on the dialogs.
    */
  def close(dialog: IDialog, args: js.Any*): Unit = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#closeAll
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Closes all dialogs
    * @param {Object} args if specified this object will be sent to any callbacks registered on the dialogs.
    */
  def closeAll(args: js.Any*): Unit = js.native
  
  /** Internal method that closes the dialog properly and cleans up resources */
  def closeDialog(dialog: IDialog): Unit = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#contentPicker
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a content picker tree in a modal, the callback returns an array of selected documents
    * @param {Object} options content picker dialog options object
    * @param {Boolean} options.multipicker should the picker return one or multiple items
    * @param {Function} options.callback callback function
    * @returns {Object} modal object
    */
  def contentPicker(options: IContentPickerOptions): IModal = js.native
  
  var dialogs: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#ysodDialog
    * @methodOf umbraco.services.dialogService
    * @description
    * Opens a dialog to an embed dialog
    */
  def embedDialog(options: js.Any): Unit = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#iconPicker
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a icon picker in a modal, the callback returns a object representing the selected icon
    * @param {Object} options iconpicker dialog options object
    * @param {Function} options.callback callback function
    * @returns {Object} modal object
    */
  def iconPicker(options: IIconPickerOptions): IModal = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#linkPicker
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a link picker tree in a modal, the callback returns a single link
    * @param {Object} options content picker dialog options object
    * @param {Function} options.callback callback function
    * @returns {Object} modal object
    */
  def linkPicker(options: ILinkPickerOptions): IModal = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#macroPicker
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a mcaro picker in a modal, the callback returns a object representing the macro and it's parameters
    * @param {Object} options macropicker dialog options object
    * @param {Function} options.callback callback function
    * @returns {Object} modal object
    */
  def macroPicker(options: IMacroPickerOptions): IModal = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#mediaPicker
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a media picker in a modal, the callback returns an array of selected media items
    * @param {Object} options mediapicker dialog options object
    * @param {Boolean} options.onlyImages Only display files that have an image file-extension
    * @param {Function} options.callback callback function
    * @returns {Object} modal object
    */
  def mediaPicker(options: IMediaPickerOptions): IModal = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#memberGroupPicker
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a member group picker in a modal, the callback returns a object representing the selected member
    * @param {Object} options member group picker dialog options object
    * @param {Boolean} options.multiPicker should the tree pick one or multiple members before returning
    * @param {Function} options.callback callback function
    * @returns {Object} modal object
    */
  def memberGroupPicker(options: IMemberGroupPickerOptions): IModal = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#memberPicker
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a member picker in a modal, the callback returns a object representing the selected member
    * @param {Object} options member picker dialog options object
    * @param {Boolean} options.multiPicker should the tree pick one or multiple members before returning
    * @param {Function} options.callback callback function
    * @returns {Object} modal object
    */
  def memberPicker(options: IMemberPickerOptions): IModal = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#open
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a modal rendering a given template url.
    *
    * @param {Object} options rendering options
    * @param {DomElement} options.container the DOM element to inject the modal into, by default set to body
    * @param {Function} options.callback function called when the modal is submitted
    * @param {String} options.template the url of the template
    * @param {String} options.animation animation csss class, by default set to "fade"
    * @param {String} options.modalClass modal css class, by default "umb-modal"
    * @param {Bool} options.show show the modal instantly
    * @param {Bool} options.iframe load template in an iframe, only needed for serverside templates
    * @param {Int} options.width set a width on the modal, only needed for iframes
    * @param {Bool} options.inline strips the modal from any animation and wrappers, used when you want to inject a dialog into an existing container
    * @returns {Object} modal object
    */
  def open(options: IDialogRenderingOptions): IModal = js.native
  
  /** Internal method that handles opening all dialogs */
  def openDialog(options: IDialogRenderingOptions): IModal = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#propertyDialog
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a dialog with a chosen property editor in, a value can be passed to the modal, and this value is returned in the callback
    * @param {Object} options mediapicker dialog options object
    * @param {Function} options.callback callback function
    * @param {String} editor editor to use to edit a given value and return on callback
    * @param {Object} value value sent to the property editor
    * @returns {Object} modal object
    */
  def propertyDialog(options: IPropertyDialogOptions): IModal = js.native
  
  /** Internal method that removes all dialogs */
  def removeAllDialogs(args: js.Any*): Unit = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#treePicker
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a tree picker in a modal, the callback returns a object representing the selected tree item
    * @param {Object} options iconpicker dialog options object
    * @param {String} options.section tree section to display
    * @param {String} options.treeAlias specific tree to display
    * @param {Boolean} options.multiPicker should the tree pick one or multiple items before returning
    * @param {Function} options.callback callback function
    * @returns {Object} modal object
    */
  def treePicker(options: ITreePickerOptions): IModal = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#ysodDialog
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a dialog to show a custom YSOD
    */
  def ysodDialog(ysodError: js.Any): Unit = js.native
}
object IDialogService {
  
  @scala.inline
  def apply(
    close: (IDialog, /* repeated */ js.Any) => Unit,
    closeAll: /* repeated */ js.Any => Unit,
    closeDialog: IDialog => Unit,
    contentPicker: IContentPickerOptions => IModal,
    embedDialog: js.Any => Unit,
    iconPicker: IIconPickerOptions => IModal,
    linkPicker: ILinkPickerOptions => IModal,
    macroPicker: IMacroPickerOptions => IModal,
    mediaPicker: IMediaPickerOptions => IModal,
    memberGroupPicker: IMemberGroupPickerOptions => IModal,
    memberPicker: IMemberPickerOptions => IModal,
    open: IDialogRenderingOptions => IModal,
    openDialog: IDialogRenderingOptions => IModal,
    propertyDialog: IPropertyDialogOptions => IModal,
    removeAllDialogs: /* repeated */ js.Any => Unit,
    treePicker: ITreePickerOptions => IModal,
    ysodDialog: js.Any => Unit
  ): IDialogService = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction2(close), closeAll = js.Any.fromFunction1(closeAll), closeDialog = js.Any.fromFunction1(closeDialog), contentPicker = js.Any.fromFunction1(contentPicker), embedDialog = js.Any.fromFunction1(embedDialog), iconPicker = js.Any.fromFunction1(iconPicker), linkPicker = js.Any.fromFunction1(linkPicker), macroPicker = js.Any.fromFunction1(macroPicker), mediaPicker = js.Any.fromFunction1(mediaPicker), memberGroupPicker = js.Any.fromFunction1(memberGroupPicker), memberPicker = js.Any.fromFunction1(memberPicker), open = js.Any.fromFunction1(open), openDialog = js.Any.fromFunction1(openDialog), propertyDialog = js.Any.fromFunction1(propertyDialog), removeAllDialogs = js.Any.fromFunction1(removeAllDialogs), treePicker = js.Any.fromFunction1(treePicker), ysodDialog = js.Any.fromFunction1(ysodDialog))
    __obj.asInstanceOf[IDialogService]
  }
  
  @scala.inline
  implicit class IDialogServiceMutableBuilder[Self <: IDialogService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: (IDialog, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "close", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCloseAll(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "closeAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloseDialog(value: IDialog => Unit): Self = StObject.set(x, "closeDialog", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContentPicker(value: IContentPickerOptions => IModal): Self = StObject.set(x, "contentPicker", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDialogs(value: js.Array[_]): Self = StObject.set(x, "dialogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogsUndefined: Self = StObject.set(x, "dialogs", js.undefined)
    
    @scala.inline
    def setDialogsVarargs(value: js.Any*): Self = StObject.set(x, "dialogs", js.Array(value :_*))
    
    @scala.inline
    def setEmbedDialog(value: js.Any => Unit): Self = StObject.set(x, "embedDialog", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIconPicker(value: IIconPickerOptions => IModal): Self = StObject.set(x, "iconPicker", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLinkPicker(value: ILinkPickerOptions => IModal): Self = StObject.set(x, "linkPicker", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMacroPicker(value: IMacroPickerOptions => IModal): Self = StObject.set(x, "macroPicker", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMediaPicker(value: IMediaPickerOptions => IModal): Self = StObject.set(x, "mediaPicker", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMemberGroupPicker(value: IMemberGroupPickerOptions => IModal): Self = StObject.set(x, "memberGroupPicker", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMemberPicker(value: IMemberPickerOptions => IModal): Self = StObject.set(x, "memberPicker", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpen(value: IDialogRenderingOptions => IModal): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenDialog(value: IDialogRenderingOptions => IModal): Self = StObject.set(x, "openDialog", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPropertyDialog(value: IPropertyDialogOptions => IModal): Self = StObject.set(x, "propertyDialog", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAllDialogs(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "removeAllDialogs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTreePicker(value: ITreePickerOptions => IModal): Self = StObject.set(x, "treePicker", js.Any.fromFunction1(value))
    
    @scala.inline
    def setYsodDialog(value: js.Any => Unit): Self = StObject.set(x, "ysodDialog", js.Any.fromFunction1(value))
  }
}
