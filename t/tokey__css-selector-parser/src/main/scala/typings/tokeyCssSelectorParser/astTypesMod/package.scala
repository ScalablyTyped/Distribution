package typings.tokeyCssSelectorParser.astTypesMod

import typings.tokeyCore.typesMod.Token
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.invalid
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth_dash
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth_of
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth_offset
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth_step
import typings.tokeyCssSelectorParser.typesMod.Immutable
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
  - typings.tokeyCssSelectorParser.astTypesMod.FunctionalSelector
  - typings.tokeyCssSelectorParser.astTypesMod.Selector
  - typings.tokeyCssSelectorParser.astTypesMod.CompoundSelector
  - typings.tokeyCssSelectorParser.astTypesMod.Combinator
  - typings.tokeyCssSelectorParser.astTypesMod.Comment
  - typings.tokeyCssSelectorParser.astTypesMod.Invalid
  - typings.tokeyCssSelectorParser.astTypesMod.Nth
  - typings.tokeyCssSelectorParser.astTypesMod.NthStep
  - typings.tokeyCssSelectorParser.astTypesMod.NthDash
  - typings.tokeyCssSelectorParser.astTypesMod.NthOffset
  - typings.tokeyCssSelectorParser.astTypesMod.NthOf
*/
type SelectorNode = _SelectorNode | Invalid | NthStep | NthDash | NthOffset | NthOf

type SelectorNodes = js.Array[SelectorNode]
