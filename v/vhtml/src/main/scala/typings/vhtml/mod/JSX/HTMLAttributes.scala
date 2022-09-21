package typings.vhtml.mod.JSX

import typings.vhtml.vhtmlStrings.decimal
import typings.vhtml.vhtmlStrings.email
import typings.vhtml.vhtmlStrings.inherit
import typings.vhtml.vhtmlStrings.no
import typings.vhtml.vhtmlStrings.none
import typings.vhtml.vhtmlStrings.numeric
import typings.vhtml.vhtmlStrings.off
import typings.vhtml.vhtmlStrings.on
import typings.vhtml.vhtmlStrings.search
import typings.vhtml.vhtmlStrings.tel
import typings.vhtml.vhtmlStrings.text
import typings.vhtml.vhtmlStrings.url
import typings.vhtml.vhtmlStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLAttributes
  extends StObject
     with AriaAttributes
     with DOMAttributes {
  
  // RDFa Attributes
  var about: js.UndefOr[String] = js.undefined
  
  // React-specific Attributes
  // Standard HTML Attributes
  var accesskey: js.UndefOr[String] = js.undefined
  
  // Non-standard Attributes
  var autocapitalize: js.UndefOr[String] = js.undefined
  
  var autocorrect: js.UndefOr[String] = js.undefined
  
  var autosave: js.UndefOr[String] = js.undefined
  
  var `class`: js.UndefOr[String] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var contenteditable: js.UndefOr[Boolean | inherit] = js.undefined
  
  var contextmenu: js.UndefOr[String] = js.undefined
  
  var datatype: js.UndefOr[String] = js.undefined
  
  var dir: js.UndefOr[String] = js.undefined
  
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var inlist: js.UndefOr[Any] = js.undefined
  
  // Living Standard
  /**
    * Hints at the type of data that might be entered by the user while editing the element or its contents
    * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
    */
  var inputmode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  
  /**
    * Specify that a standard HTML element should behave like a defined custom built-in element
    * @see https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is
    */
  var is: js.UndefOr[String] = js.undefined
  
  var itemid: js.UndefOr[String] = js.undefined
  
  var itemprop: js.UndefOr[String] = js.undefined
  
  var itemref: js.UndefOr[String] = js.undefined
  
  var itemscope: js.UndefOr[Boolean] = js.undefined
  
  var itemtype: js.UndefOr[String] = js.undefined
  
  var lang: js.UndefOr[String] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var property: js.UndefOr[String] = js.undefined
  
  // Unknown
  var radiogroup: js.UndefOr[String] = js.undefined
  
  var resource: js.UndefOr[String] = js.undefined
  
  var results: js.UndefOr[Double] = js.undefined
  
  // <command>, <menuitem>
  // WAI-ARIA
  var role: js.UndefOr[String] = js.undefined
  
  var security: js.UndefOr[String] = js.undefined
  
  var slot: js.UndefOr[String] = js.undefined
  
  var spellcheck: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[String] = js.undefined
  
  var tabindex: js.UndefOr[Double] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var translate: js.UndefOr[yes | no] = js.undefined
  
  var typeof: js.UndefOr[String] = js.undefined
  
  var unselectable: js.UndefOr[on | off] = js.undefined
  
  var vocab: js.UndefOr[String] = js.undefined
}
object HTMLAttributes {
  
  inline def apply(): HTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLAttributes]
  }
  
  extension [Self <: HTMLAttributes](x: Self) {
    
    inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
    
    inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
    
    inline def setAccesskey(value: String): Self = StObject.set(x, "accesskey", value.asInstanceOf[js.Any])
    
    inline def setAccesskeyUndefined: Self = StObject.set(x, "accesskey", js.undefined)
    
    inline def setAutocapitalize(value: String): Self = StObject.set(x, "autocapitalize", value.asInstanceOf[js.Any])
    
    inline def setAutocapitalizeUndefined: Self = StObject.set(x, "autocapitalize", js.undefined)
    
    inline def setAutocorrect(value: String): Self = StObject.set(x, "autocorrect", value.asInstanceOf[js.Any])
    
    inline def setAutocorrectUndefined: Self = StObject.set(x, "autocorrect", js.undefined)
    
    inline def setAutosave(value: String): Self = StObject.set(x, "autosave", value.asInstanceOf[js.Any])
    
    inline def setAutosaveUndefined: Self = StObject.set(x, "autosave", js.undefined)
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setContenteditable(value: Boolean | inherit): Self = StObject.set(x, "contenteditable", value.asInstanceOf[js.Any])
    
    inline def setContenteditableUndefined: Self = StObject.set(x, "contenteditable", js.undefined)
    
    inline def setContextmenu(value: String): Self = StObject.set(x, "contextmenu", value.asInstanceOf[js.Any])
    
    inline def setContextmenuUndefined: Self = StObject.set(x, "contextmenu", js.undefined)
    
    inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
    
    inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
    
    inline def setInputmode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputmode", value.asInstanceOf[js.Any])
    
    inline def setInputmodeUndefined: Self = StObject.set(x, "inputmode", js.undefined)
    
    inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
    
    inline def setItemid(value: String): Self = StObject.set(x, "itemid", value.asInstanceOf[js.Any])
    
    inline def setItemidUndefined: Self = StObject.set(x, "itemid", js.undefined)
    
    inline def setItemprop(value: String): Self = StObject.set(x, "itemprop", value.asInstanceOf[js.Any])
    
    inline def setItempropUndefined: Self = StObject.set(x, "itemprop", js.undefined)
    
    inline def setItemref(value: String): Self = StObject.set(x, "itemref", value.asInstanceOf[js.Any])
    
    inline def setItemrefUndefined: Self = StObject.set(x, "itemref", js.undefined)
    
    inline def setItemscope(value: Boolean): Self = StObject.set(x, "itemscope", value.asInstanceOf[js.Any])
    
    inline def setItemscopeUndefined: Self = StObject.set(x, "itemscope", js.undefined)
    
    inline def setItemtype(value: String): Self = StObject.set(x, "itemtype", value.asInstanceOf[js.Any])
    
    inline def setItemtypeUndefined: Self = StObject.set(x, "itemtype", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setRadiogroup(value: String): Self = StObject.set(x, "radiogroup", value.asInstanceOf[js.Any])
    
    inline def setRadiogroupUndefined: Self = StObject.set(x, "radiogroup", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    
    inline def setSpellcheck(value: Boolean): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
    
    inline def setSpellcheckUndefined: Self = StObject.set(x, "spellcheck", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTabindex(value: Double): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
    
    inline def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
    
    inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
    
    inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
    
    inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
    
    inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
    
    inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
  }
}
