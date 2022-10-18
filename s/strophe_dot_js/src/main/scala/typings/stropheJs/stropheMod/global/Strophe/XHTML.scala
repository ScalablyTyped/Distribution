package typings.stropheJs.stropheMod.global.Strophe

import typings.stropheJs.anon.A
import typings.stropheJs.stropheJsStrings.`background-color`
import typings.stropheJs.stropheJsStrings.`font-family`
import typings.stropheJs.stropheJsStrings.`font-size`
import typings.stropheJs.stropheJsStrings.`font-style`
import typings.stropheJs.stropheJsStrings.`font-weight`
import typings.stropheJs.stropheJsStrings.`margin-left`
import typings.stropheJs.stropheJsStrings.`margin-right`
import typings.stropheJs.stropheJsStrings.`text-align`
import typings.stropheJs.stropheJsStrings.`text-decoration`
import typings.stropheJs.stropheJsStrings.a
import typings.stropheJs.stropheJsStrings.blockquote
import typings.stropheJs.stropheJsStrings.body
import typings.stropheJs.stropheJsStrings.br
import typings.stropheJs.stropheJsStrings.cite
import typings.stropheJs.stropheJsStrings.color
import typings.stropheJs.stropheJsStrings.em
import typings.stropheJs.stropheJsStrings.img
import typings.stropheJs.stropheJsStrings.li
import typings.stropheJs.stropheJsStrings.ol
import typings.stropheJs.stropheJsStrings.p
import typings.stropheJs.stropheJsStrings.span
import typings.stropheJs.stropheJsStrings.strong
import typings.stropheJs.stropheJsStrings.ul
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants: XHTML_IM Namespace
  *  contains allowed tags, tag attributes, and css properties.
  *  Used in the createHtml function to filter incoming html into the allowed XHTML-IM subset.
  *  See http://xmpp.org/extensions/xep-0071.html#profile-summary for the list of recommended
  *  allowed tags and their attributes.
  */
object XHTML {
  
  @JSGlobal("Strophe.XHTML")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Strophe.XHTML.attributes")
  @js.native
  def attributes: A = js.native
  inline def attributes_=(x: A): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attributes")(x.asInstanceOf[js.Any])
  
  @JSGlobal("Strophe.XHTML.css")
  @js.native
  def css: js.Tuple10[
    `background-color`, 
    color, 
    `font-family`, 
    `font-size`, 
    `font-style`, 
    `font-weight`, 
    `margin-left`, 
    `margin-right`, 
    `text-align`, 
    `text-decoration`
  ] = js.native
  inline def css_=(
    x: js.Tuple10[
      `background-color`, 
      color, 
      `font-family`, 
      `font-size`, 
      `font-style`, 
      `font-weight`, 
      `margin-left`, 
      `margin-right`, 
      `text-align`, 
      `text-decoration`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("css")(x.asInstanceOf[js.Any])
  
  @JSGlobal("Strophe.XHTML.tags")
  @js.native
  def tags: js.Tuple13[a, blockquote, br, cite, em, img, li, ol, p, span, strong, ul, body] = js.native
  inline def tags_=(x: js.Tuple13[a, blockquote, br, cite, em, img, li, ol, p, span, strong, ul, body]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tags")(x.asInstanceOf[js.Any])
  
  /**
    * Function: XHTML.validAttribute
    * Utility method to determine whether an attribute is allowed as recommended per XEP-0071 for the passed tag
    *
    * @param tag XHTML tag names are case sensitive and must be lower case
    * @param attribute XHTML attribute names are case sensitive and must be lower case.
    */
  inline def validAttribute(tag: String, attribute: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validAttribute")(tag.asInstanceOf[js.Any], attribute.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Function: XHTML.validCSS
    * Utility method to determine whether an css style attribute is allowed as recommended per XEP-0071
    *
    * @param style XHTML css style attribute names are case sensitive and must be lower case in snake-case.
    */
  inline def validCSS(style: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validCSS")(style.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Function: XHTML.validTag
    * Utility method to determine whether a tag is allowed in the XHTML_IM namespace.
    *
    * @param tag XHTML tag names are case sensitive and must be lower case.
    */
  inline def validTag(tag: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validTag")(tag.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
