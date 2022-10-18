package typings.tokeyCssSelectorParser.distAstTypesMod

import typings.tokeyCore.distTypesMod.Token
import typings.tokeyCssSelectorParser.distTypesMod.Immutable
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.invalid
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth_dash
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth_of
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth_offset
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth_step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ImmutableAttribute = Immutable[Attribute]

type ImmutableClass = Immutable[Class]

type ImmutableCombinator = Immutable[Combinator]

type ImmutableComment = Immutable[Comment]

type ImmutableCommentWithNoSpacing = Immutable[CommentWithNoSpacing]

type ImmutableCompoundSelector = Immutable[CompoundSelector]

type ImmutableFunctionalSelector = Immutable[FunctionalSelector]

type ImmutableId = Immutable[Id]

type ImmutableInvalid = Immutable[Invalid]

type ImmutableNamespacedNode = Immutable[NamespacedNode]

type ImmutableNesting = Immutable[Nesting]

type ImmutableNth = Immutable[Nth]

type ImmutableNthDash = Immutable[NthDash]

type ImmutableNthOf = Immutable[NthOf]

type ImmutableNthOffset = Immutable[NthOffset]

type ImmutableNthSelectorList = Immutable[NthSelectorList]

type ImmutableNthStep = Immutable[NthStep]

type ImmutablePseudoClass = Immutable[PseudoClass]

type ImmutablePseudoElement = Immutable[PseudoElement]

type ImmutableSelector = Immutable[Selector]

type ImmutableSelectorList = Immutable[SelectorList]

type ImmutableSelectorNode = Immutable[SelectorNode]

type ImmutableType = Immutable[Type]

type ImmutableUniversal = Immutable[Universal]

type Invalid = Token[invalid]

type NthDash = NthBase[nth_dash]

type NthNode = NthStep | NthOffset | NthDash | NthOf | Comment

type NthOf = NthBase[nth_of]

type NthOffset = NthBase[nth_offset]

type NthSelectorList = Array[Nth | Selector]

type NthStep = NthBase[nth_step]

type SelectorList = js.Array[Selector]

/* Rewritten from type alias, can be one of: 
  - typings.tokeyCssSelectorParser.distAstTypesMod.FunctionalSelector
  - typings.tokeyCssSelectorParser.distAstTypesMod.Selector
  - typings.tokeyCssSelectorParser.distAstTypesMod.CompoundSelector
  - typings.tokeyCssSelectorParser.distAstTypesMod.Combinator
  - typings.tokeyCssSelectorParser.distAstTypesMod.Comment
  - typings.tokeyCssSelectorParser.distAstTypesMod.Invalid
  - typings.tokeyCssSelectorParser.distAstTypesMod.Nth
  - typings.tokeyCssSelectorParser.distAstTypesMod.NthStep
  - typings.tokeyCssSelectorParser.distAstTypesMod.NthDash
  - typings.tokeyCssSelectorParser.distAstTypesMod.NthOffset
  - typings.tokeyCssSelectorParser.distAstTypesMod.NthOf
*/
type SelectorNode = _SelectorNode | Invalid | NthStep | NthDash | NthOffset | NthOf

type SelectorNodes = js.Array[SelectorNode]
