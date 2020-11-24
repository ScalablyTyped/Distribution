package typings.x2js.mod

import typings.std.Date
import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait X2JS extends js.Object {
  
  /**
    * Converts the provided property into an array. If the property is already an Array then it will return unchanged.
    * 
    * @template T
    * @param {(T | Array<T>)} prop
    * @returns {Array<T>}
    * 
    * @memberOf X2JS
    */
  def asArray[T](prop: T): js.Array[T] = js.native
  def asArray[T](prop: js.Array[T]): js.Array[T] = js.native
  
  /**
    * Converts the provided date string into a javascript Date instance.
    * 
    * @param {string} prop
    * @returns {Date}
    * 
    * @memberOf X2JS
    */
  def asDateTime(prop: String): Date = js.native
  
  /**
    * Transforms a DOM tree to JavaScript objects.
    * 
    * @template T
    * @param {Node} domNode
    * @returns {T}
    * 
    * @memberOf X2JS
    */
  def dom2js[T](domNode: Document): T = js.native
  
  /**
    * Gets the current version of x2js. 
    * 
    * @returns {string}
    * 
    * @memberOf X2JS
    */
  def getVersion(): String = js.native
  
  /**
    * 
    * 
    * @template T
    * @param {T} jsObject
    * @returns {Node}
    * 
    * @memberOf X2JS
    */
  def js2dom[T](jsObject: T): Document = js.native
  
  /**
    * Transforms JavaScript objects into an XML string.
    * 
    * @template T
    * @param {T} json
    * @returns {string}
    * 
    * @memberOf X2JS
    */
  def js2xml[T](json: T): String = js.native
  
  def toXmlDateTime(dt: Double): String = js.native
  /**
    * Converts the provided date value to a valid XML string.
    * 
    * @param {(Date | number)} dt
    * @returns {string}
    * 
    * @memberOf X2JS
    */
  def toXmlDateTime(dt: Date): String = js.native
  
  /**
    * Transformns an XML string into DOM-tree
    * 
    * @param {string} xml
    * @returns {Node}
    * 
    * @memberOf X2JS
    */
  def xml2dom(xml: String): Document = js.native
  
  /**
    * Transformns an XML string into JavaScript objects.
    * 
    * @template T
    * @param {string} xml
    * @returns {T}
    * 
    * @memberOf X2JS
    */
  def xml2js[T](xml: String): T = js.native
}
