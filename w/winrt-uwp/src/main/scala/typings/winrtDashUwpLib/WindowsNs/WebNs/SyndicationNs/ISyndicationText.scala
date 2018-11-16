package typings
package winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents text, HTML, or XHTML content. This interface encapsulates elements in RSS 2.0 or Atom 1.0 that can have either text, HTML, or XHTML content. In Atom 1.0 this interface maps to an atomTextConstruct in the schema, which can be element atom:title, atom:subtitle, atom:rights or atom:summary. */

trait ISyndicationText extends ISyndicationNode {
  /** Gets or sets the content of a text content construct like atom:title. */
  var text: java.lang.String
  /** Gets or sets the type of the content. */
  var `type`: java.lang.String
  /** Gets or sets the XML content. */
  var xml: winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
}

