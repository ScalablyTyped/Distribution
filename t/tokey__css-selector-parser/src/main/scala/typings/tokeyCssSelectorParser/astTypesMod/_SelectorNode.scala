package typings.tokeyCssSelectorParser.astTypesMod

import typings.tokeyCssSelectorParser.anon.First
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Greaterthansign
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Plussign
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Tilde
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.space
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _SelectorNode extends StObject
object _SelectorNode {
  
  inline def Attribute(end: Double, start: Double, value: String): typings.tokeyCssSelectorParser.astTypesMod.Attribute = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("attribute")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.astTypesMod.Attribute]
  }
  
  inline def Class(dotComments: SelectorNodes, end: Double, start: Double, value: String): typings.tokeyCssSelectorParser.astTypesMod.Class = {
    val __obj = js.Dynamic.literal(dotComments = dotComments.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("class")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.astTypesMod.Class]
  }
  
  inline def Combinator(
    after: String,
    before: String,
    combinator: space | Plussign | Tilde | Greaterthansign,
    end: Double,
    invalid: Boolean,
    start: Double,
    value: String
  ): typings.tokeyCssSelectorParser.astTypesMod.Combinator = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], combinator = combinator.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("combinator")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.astTypesMod.Combinator]
  }
  
  inline def Comment(after: String, before: String, end: Double, start: Double, value: String): typings.tokeyCssSelectorParser.astTypesMod.Comment = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("comment")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.astTypesMod.Comment]
  }
  
  inline def CompoundSelector(
    after: String,
    before: String,
    end: Double,
    invalid: Boolean,
    nodes: js.Array[
      SimpleSelector | Nesting | CommentWithNoSpacing | Invalid | PseudoElement | typings.tokeyCssSelectorParser.astTypesMod.CompoundSelector | Selector
    ],
    start: Double
  ): typings.tokeyCssSelectorParser.astTypesMod.CompoundSelector = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("compound_selector")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.astTypesMod.CompoundSelector]
  }
  
  inline def Id(end: Double, start: Double, value: String): typings.tokeyCssSelectorParser.astTypesMod.Id = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("id")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.astTypesMod.Id]
  }
  
  inline def Nesting(end: Double, start: Double): typings.tokeyCssSelectorParser.astTypesMod.Nesting = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = "&")
    __obj.updateDynamic("type")("nesting")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.astTypesMod.Nesting]
  }
  
  inline def Nth(after: String, before: String, end: Double, nodes: js.Array[NthNode], start: Double): typings.tokeyCssSelectorParser.astTypesMod.Nth = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("nth")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.astTypesMod.Nth]
  }
  
  inline def PseudoClass(colonComments: js.Array[Comment], end: Double, start: Double, value: String): typings.tokeyCssSelectorParser.astTypesMod.PseudoClass = {
    val __obj = js.Dynamic.literal(colonComments = colonComments.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pseudo_class")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.astTypesMod.PseudoClass]
  }
  
  inline def PseudoElement(colonComments: First, end: Double, start: Double, value: String): typings.tokeyCssSelectorParser.astTypesMod.PseudoElement = {
    val __obj = js.Dynamic.literal(colonComments = colonComments.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pseudo_element")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.astTypesMod.PseudoElement]
  }
  
  inline def Selector(after: String, before: String, end: Double, nodes: SelectorNodes, start: Double): typings.tokeyCssSelectorParser.astTypesMod.Selector = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("selector")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.astTypesMod.Selector]
  }
  
  inline def Type(end: Double, start: Double, value: String): typings.tokeyCssSelectorParser.astTypesMod.Type = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.astTypesMod.Type]
  }
  
  inline def Universal(end: Double, start: Double, value: String): typings.tokeyCssSelectorParser.astTypesMod.Universal = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("universal")
    __obj.asInstanceOf[typings.tokeyCssSelectorParser.astTypesMod.Universal]
  }
}
