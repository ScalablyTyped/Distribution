package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSSStyleSheet extends StyleSheet {
  val cssRules: CSSRuleList = js.native
  /** @deprecated */
  var cssText: java.lang.String = js.native
  /** @deprecated */
  val id: java.lang.String = js.native
  /** @deprecated */
  val imports: StyleSheetList = js.native
  /** @deprecated */
  val isAlternate: scala.Boolean = js.native
  /** @deprecated */
  val isPrefAlternate: scala.Boolean = js.native
  val ownerRule: CSSRule | scala.Null = js.native
  /** @deprecated */
  val owningElement: Element = js.native
  /** @deprecated */
  val pages: js.Any = js.native
  /** @deprecated */
  val readOnly: scala.Boolean = js.native
  val rules: CSSRuleList = js.native
  /** @deprecated */
  def addImport(bstrURL: java.lang.String): scala.Double = js.native
  /** @deprecated */
  def addImport(bstrURL: java.lang.String, lIndex: scala.Double): scala.Double = js.native
  /** @deprecated */
  def addPageRule(bstrSelector: java.lang.String, bstrStyle: java.lang.String): scala.Double = js.native
  /** @deprecated */
  def addPageRule(bstrSelector: java.lang.String, bstrStyle: java.lang.String, lIndex: scala.Double): scala.Double = js.native
  def addRule(bstrSelector: java.lang.String): scala.Double = js.native
  def addRule(bstrSelector: java.lang.String, bstrStyle: java.lang.String): scala.Double = js.native
  def addRule(bstrSelector: java.lang.String, bstrStyle: java.lang.String, lIndex: scala.Double): scala.Double = js.native
  def deleteRule(): scala.Unit = js.native
  def deleteRule(index: scala.Double): scala.Unit = js.native
  def insertRule(rule: java.lang.String): scala.Double = js.native
  def insertRule(rule: java.lang.String, index: scala.Double): scala.Double = js.native
  /** @deprecated */
  def removeImport(lIndex: scala.Double): scala.Unit = js.native
  def removeRule(lIndex: scala.Double): scala.Unit = js.native
}

@JSGlobal("CSSStyleSheet")
@js.native
object CSSStyleSheet
  extends ScalablyTyped.runtime.Instantiable0[CSSStyleSheet]

