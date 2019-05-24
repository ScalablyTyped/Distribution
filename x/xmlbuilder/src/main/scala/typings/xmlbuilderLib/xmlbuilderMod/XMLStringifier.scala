package typings
package xmlbuilderLib.xmlbuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the functions used for converting values to strings.
  */
trait XMLStringifier extends js.Object {
  /**
    * Escapes special characters in attribute values.
    */
  var attEscape: js.UndefOr[js.Function1[/* v */ java.lang.String, java.lang.String]] = js.undefined
  /**
    * Converts attribute value to string
    */
  var attValue: js.UndefOr[js.Function1[/* v */ js.Any, java.lang.String]] = js.undefined
  /**
    * Converts the contents of a CDATA node to string
    */
  var cdata: js.UndefOr[js.Function1[/* v */ js.Any, java.lang.String]] = js.undefined
  /**
    * Converts the contents of a comment node to string
    */
  var comment: js.UndefOr[js.Function1[/* v */ js.Any, java.lang.String]] = js.undefined
  /** 
    * When prepended to a JS object key, converts the key-value pair 
    * to an attribute. 
    */
  var convertAttKey: js.UndefOr[java.lang.String] = js.undefined
  /** 
    * When prepended to a JS object key, converts its value to a CDATA 
    * node. 
    */
  var convertCDataKey: js.UndefOr[java.lang.String] = js.undefined
  /** 
    * When prepended to a JS object key, converts its value to a 
    * comment node.
    */
  var convertCommentKey: js.UndefOr[java.lang.String] = js.undefined
  /** 
    * When prepended to a JS object key, converts the key-value pair 
    * to a processing instruction node. 
    */
  var convertPIKey: js.UndefOr[java.lang.String] = js.undefined
  /** 
    * When prepended to a JS object key, converts its value to a raw 
    * text node. 
    */
  var convertRawKey: js.UndefOr[java.lang.String] = js.undefined
  /** 
    * When prepended to a JS object key, converts its value to a text node. 
    * 
    * _Note:_ Since JS objects cannot contain duplicate keys, multiple text 
    * nodes can be created by adding some unique text after each object 
    * key. For example: `{ '#text1': 'some text', '#text2': 'more text' };`
    */
  var convertTextKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Converts `!ATTLIST` node default value inside DocType to string
    */
  var dtdAttDefault: js.UndefOr[js.Function1[/* v */ js.Any, java.lang.String]] = js.undefined
  /**
    * Converts `!ATTLIST` node type inside DocType to string
    */
  var dtdAttType: js.UndefOr[js.Function1[/* v */ js.Any, java.lang.String]] = js.undefined
  /**
    * Converts `!ELEMENT` node content inside Doctype to string
    */
  var dtdElementValue: js.UndefOr[js.Function1[/* v */ js.Any, java.lang.String]] = js.undefined
  /**
    * Converts `!ENTITY` node content inside Doctype to string
    */
  var dtdEntityValue: js.UndefOr[js.Function1[/* v */ js.Any, java.lang.String]] = js.undefined
  /**
    * Converts `!NOTATION` node content inside Doctype to string
    */
  var dtdNData: js.UndefOr[js.Function1[/* v */ js.Any, java.lang.String]] = js.undefined
  /**
    * Converts DocType public identifier to string
    */
  var dtdPubID: js.UndefOr[js.Function1[/* v */ js.Any, java.lang.String]] = js.undefined
  /**
    * Converts DocType system identifier to string
    */
  var dtdSysID: js.UndefOr[js.Function1[/* v */ js.Any, java.lang.String]] = js.undefined
  /**
    * Converts processing instruction target to string
    */
  var insTarget: js.UndefOr[js.Function1[/* v */ js.Any, java.lang.String]] = js.undefined
  /**
    * Converts processing instruction value to string
    */
  var insValue: js.UndefOr[js.Function1[/* v */ js.Any, java.lang.String]] = js.undefined
  /**
    * Converts an element or attribute name to string
    */
  var name: js.UndefOr[js.Function1[/* v */ js.Any, java.lang.String]] = js.undefined
  /**
    * Converts the contents of a raw text node to string
    */
  var raw: js.UndefOr[js.Function1[/* v */ js.Any, java.lang.String]] = js.undefined
  /**
    * Converts the contents of a text node to string
    */
  var text: js.UndefOr[js.Function1[/* v */ js.Any, java.lang.String]] = js.undefined
  /**
    * Escapes special characters in text.
    */
  var textEscape: js.UndefOr[js.Function1[/* v */ java.lang.String, java.lang.String]] = js.undefined
  /**
    * Converts XML encoding to string
    */
  var xmlEncoding: js.UndefOr[js.Function1[/* v */ js.Any, java.lang.String]] = js.undefined
  /**
    * Converts standalone document declaration to string
    */
  var xmlStandalone: js.UndefOr[js.Function1[/* v */ js.Any, java.lang.String]] = js.undefined
  /**
    * Converts XML version to string
    */
  var xmlVersion: js.UndefOr[js.Function1[/* v */ js.Any, java.lang.String]] = js.undefined
}

object XMLStringifier {
  @scala.inline
  def apply(
    attEscape: /* v */ java.lang.String => java.lang.String = null,
    attValue: /* v */ js.Any => java.lang.String = null,
    cdata: /* v */ js.Any => java.lang.String = null,
    comment: /* v */ js.Any => java.lang.String = null,
    convertAttKey: java.lang.String = null,
    convertCDataKey: java.lang.String = null,
    convertCommentKey: java.lang.String = null,
    convertPIKey: java.lang.String = null,
    convertRawKey: java.lang.String = null,
    convertTextKey: java.lang.String = null,
    dtdAttDefault: /* v */ js.Any => java.lang.String = null,
    dtdAttType: /* v */ js.Any => java.lang.String = null,
    dtdElementValue: /* v */ js.Any => java.lang.String = null,
    dtdEntityValue: /* v */ js.Any => java.lang.String = null,
    dtdNData: /* v */ js.Any => java.lang.String = null,
    dtdPubID: /* v */ js.Any => java.lang.String = null,
    dtdSysID: /* v */ js.Any => java.lang.String = null,
    insTarget: /* v */ js.Any => java.lang.String = null,
    insValue: /* v */ js.Any => java.lang.String = null,
    name: /* v */ js.Any => java.lang.String = null,
    raw: /* v */ js.Any => java.lang.String = null,
    text: /* v */ js.Any => java.lang.String = null,
    textEscape: /* v */ java.lang.String => java.lang.String = null,
    xmlEncoding: /* v */ js.Any => java.lang.String = null,
    xmlStandalone: /* v */ js.Any => java.lang.String = null,
    xmlVersion: /* v */ js.Any => java.lang.String = null
  ): XMLStringifier = {
    val __obj = js.Dynamic.literal()
    if (attEscape != null) __obj.updateDynamic("attEscape")(js.Any.fromFunction1(attEscape))
    if (attValue != null) __obj.updateDynamic("attValue")(js.Any.fromFunction1(attValue))
    if (cdata != null) __obj.updateDynamic("cdata")(js.Any.fromFunction1(cdata))
    if (comment != null) __obj.updateDynamic("comment")(js.Any.fromFunction1(comment))
    if (convertAttKey != null) __obj.updateDynamic("convertAttKey")(convertAttKey)
    if (convertCDataKey != null) __obj.updateDynamic("convertCDataKey")(convertCDataKey)
    if (convertCommentKey != null) __obj.updateDynamic("convertCommentKey")(convertCommentKey)
    if (convertPIKey != null) __obj.updateDynamic("convertPIKey")(convertPIKey)
    if (convertRawKey != null) __obj.updateDynamic("convertRawKey")(convertRawKey)
    if (convertTextKey != null) __obj.updateDynamic("convertTextKey")(convertTextKey)
    if (dtdAttDefault != null) __obj.updateDynamic("dtdAttDefault")(js.Any.fromFunction1(dtdAttDefault))
    if (dtdAttType != null) __obj.updateDynamic("dtdAttType")(js.Any.fromFunction1(dtdAttType))
    if (dtdElementValue != null) __obj.updateDynamic("dtdElementValue")(js.Any.fromFunction1(dtdElementValue))
    if (dtdEntityValue != null) __obj.updateDynamic("dtdEntityValue")(js.Any.fromFunction1(dtdEntityValue))
    if (dtdNData != null) __obj.updateDynamic("dtdNData")(js.Any.fromFunction1(dtdNData))
    if (dtdPubID != null) __obj.updateDynamic("dtdPubID")(js.Any.fromFunction1(dtdPubID))
    if (dtdSysID != null) __obj.updateDynamic("dtdSysID")(js.Any.fromFunction1(dtdSysID))
    if (insTarget != null) __obj.updateDynamic("insTarget")(js.Any.fromFunction1(insTarget))
    if (insValue != null) __obj.updateDynamic("insValue")(js.Any.fromFunction1(insValue))
    if (name != null) __obj.updateDynamic("name")(js.Any.fromFunction1(name))
    if (raw != null) __obj.updateDynamic("raw")(js.Any.fromFunction1(raw))
    if (text != null) __obj.updateDynamic("text")(js.Any.fromFunction1(text))
    if (textEscape != null) __obj.updateDynamic("textEscape")(js.Any.fromFunction1(textEscape))
    if (xmlEncoding != null) __obj.updateDynamic("xmlEncoding")(js.Any.fromFunction1(xmlEncoding))
    if (xmlStandalone != null) __obj.updateDynamic("xmlStandalone")(js.Any.fromFunction1(xmlStandalone))
    if (xmlVersion != null) __obj.updateDynamic("xmlVersion")(js.Any.fromFunction1(xmlVersion))
    __obj.asInstanceOf[XMLStringifier]
  }
}

