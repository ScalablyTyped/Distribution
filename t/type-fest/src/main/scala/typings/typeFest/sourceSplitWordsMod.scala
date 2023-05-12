package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSplitWordsMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Sentence extends / * template literal string: ${inferLeftSide}${Character} * / string ? type-fest.type-fest/source/split-words.SkipEmptyWord</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LeftSide * / any> : never
    }}}
    */
  type RemoveLastCharacter[Sentence /* <: String */, Character /* <: String */] = js.Array[Any]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Word extends '' ? [] : [Word]
    }}}
    */
  type SkipEmptyWord[Word /* <: String */] = js.Array[Any]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Sentence extends / * template literal string: ${inferFirstCharacter}${inferRemainingCharacters} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirstCharacter * / any extends type-fest.type-fest/source/internal.WordSeparators ? [...type-fest.type-fest/source/split-words.SkipEmptyWord<CurrentWord>, ...type-fest.type-fest/source/split-words.SplitWords</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RemainingCharacters * / any, '', ''>] : LastCharacter extends '' ? type-fest.type-fest/source/split-words.SplitWords</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RemainingCharacters * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirstCharacter * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirstCharacter * / any> : [false, true] extends [type-fest.type-fest/source/internal.IsNumeric<LastCharacter>, type-fest.type-fest/source/internal.IsNumeric</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirstCharacter * / any>] ? [...type-fest.type-fest/source/split-words.SkipEmptyWord<CurrentWord>, ...type-fest.type-fest/source/split-words.SplitWords</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RemainingCharacters * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirstCharacter * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirstCharacter * / any>] : [true, false] extends [type-fest.type-fest/source/internal.IsNumeric<LastCharacter>, type-fest.type-fest/source/internal.IsNumeric</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirstCharacter * / any>] ? [...type-fest.type-fest/source/split-words.SkipEmptyWord<CurrentWord>, ...type-fest.type-fest/source/split-words.SplitWords</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RemainingCharacters * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirstCharacter * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirstCharacter * / any>] : [true, true] extends [type-fest.type-fest/source/internal.IsNumeric<LastCharacter>, type-fest.type-fest/source/internal.IsNumeric</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirstCharacter * / any>] ? type-fest.type-fest/source/split-words.SplitWords</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RemainingCharacters * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirstCharacter * / any, / * template literal string: ${CurrentWord}${FirstCharacter} * / string> : [true, true] extends [type-fest.type-fest/source/internal.IsLowerCase<LastCharacter>, type-fest.type-fest/source/internal.IsUpperCase</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirstCharacter * / any>] ? [...type-fest.type-fest/source/split-words.SkipEmptyWord<CurrentWord>, ...type-fest.type-fest/source/split-words.SplitWords</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RemainingCharacters * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirstCharacter * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirstCharacter * / any>] : [true, true] extends [type-fest.type-fest/source/internal.IsUpperCase<LastCharacter>, type-fest.type-fest/source/internal.IsLowerCase</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirstCharacter * / any>] ? [...type-fest.type-fest/source/split-words.RemoveLastCharacter<CurrentWord, LastCharacter>, ...type-fest.type-fest/source/split-words.SplitWords</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RemainingCharacters * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirstCharacter * / any, / * template literal string: ${LastCharacter}${FirstCharacter} * / string>] : type-fest.type-fest/source/split-words.SplitWords</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RemainingCharacters * / any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirstCharacter * / any, / * template literal string: ${CurrentWord}${FirstCharacter} * / string> : [...type-fest.type-fest/source/split-words.SkipEmptyWord<CurrentWord>]
    }}}
    */
  type SplitWords[Sentence /* <: String */, LastCharacter /* <: String */, CurrentWord /* <: String */] = /* import warning: importer.ImportType#apply c repeated non-array type: CurrentWord extends '' ? [] : [CurrentWord] */ js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: CurrentWord extends '' ? [] : [CurrentWord] */ js.Any
  ]
}
