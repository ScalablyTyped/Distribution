package typings.typeFest

import typings.typeFest.sourceConditionalSimplifyMod.ConditionalSimplifyDeep
import typings.typeFest.sourceEnforceOptionalMod.EnforceOptional
import typings.typeFest.sourceInternalMod.UnknownArrayOrTuple
import typings.typeFest.sourceInternalMod.UnknownRecord
import typings.typeFest.sourceMergeMod.Merge
import typings.typeFest.sourceOmitIndexSignatureMod.OmitIndexSignature
import typings.typeFest.sourcePickIndexSignatureMod.PickIndexSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceMergeDeepMod {
  
  /**
  Merge mode for array/tuple elements.
  */
  /* Rewritten from type alias, can be one of: 
    - typings.typeFest.typeFestStrings.spread
    - typings.typeFest.typeFestStrings.replace
  */
  trait ArrayMergeMode extends StObject
  object ArrayMergeMode {
    
    inline def replace: typings.typeFest.typeFestStrings.replace = "replace".asInstanceOf[typings.typeFest.typeFestStrings.replace]
    
    inline def spread: typings.typeFest.typeFestStrings.spread = "spread".asInstanceOf[typings.typeFest.typeFestStrings.spread]
  }
  
  /**
  Merge default and internal options with user provided options.
  */
  type DefaultMergeDeepOptions[Options /* <: MergeDeepOptions */] = Merge[typings.typeFest.anon.ArrayMergeMode, Options]
  
  /**
  Merge two arrays/tuples according to the chosen {@link MergeDeepOptions.arrayMergeMode arrayMergeMode} option.
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    type-fest.type-fest/source/merge-deep.ShouldSpread<Options> extends true ? std.Array<std.Exclude<Destination, undefined>[number] | std.Exclude<Source, undefined>[number]> : Source
    }}}
    */
  @js.native
  trait DoMergeArrayOrTuple[Destination /* <: UnknownArrayOrTuple */, Source /* <: UnknownArrayOrTuple */, Options /* <: MergeDeepInternalOptions */] extends StObject
  
  /**
  Walk through the union of the keys of the two objects and test in which object the properties are defined.
  - If the source does not contain the key, the value of the destination is returned.
  - If the source contains the key and the destination does not contain the key, the value of the source is returned.
  - If both contain the key, try to merge according to the chosen {@link MergeDeepOptions options} or return the source if unable to merge.
  */
  type DoMergeDeepRecord[Destination /* <: UnknownRecord */, Source /* <: UnknownRecord */, Options /* <: MergeDeepInternalOptions */] = EnforceOptional[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof Destination | keyof Source ]: Key extends keyof Source? Key extends keyof Destination? type-fest.type-fest/source/merge-deep.MergeDeepRecordProperty<Destination[Key], Source[Key], Options> : Source[Key] : Key extends keyof Destination? Destination[Key] : never} */ js.Any
  ]
  
  /**
  Merge two tuples recursively.
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Destination extends [] ? Source extends [] ? [] : type-fest.type-fest/source/merge-deep.MergeArrayTypeAndTuple<DestinationRestType, Source, Options> : Source extends [] ? type-fest.type-fest/source/merge-deep.MergeTupleAndArrayType<Destination, SourceRestType, Options> : [type-fest.type-fest/source/merge-deep.MergeDeepArrayOrTupleElements<type-fest.type-fest/source/internal.FirstArrayElement<Destination>, type-fest.type-fest/source/internal.FirstArrayElement<Source>, Options>, ...type-fest.type-fest/source/merge-deep.DoMergeDeepTupleAndTupleRecursive<type-fest.type-fest/source/internal.ArrayTail<Destination>, type-fest.type-fest/source/internal.ArrayTail<Source>, DestinationRestType, SourceRestType, Options>]
    }}}
    */
  @js.native
  trait DoMergeDeepTupleAndTupleRecursive[Destination /* <: UnknownArrayOrTuple */, Source /* <: UnknownArrayOrTuple */, DestinationRestType, SourceRestType, Options /* <: MergeDeepInternalOptions */] extends StObject
  
  /**
  Merge a tuple with an array type recursively.
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Tuple extends [] ? Tuple : [type-fest.type-fest/source/merge-deep.MergeDeepArrayOrTupleElements<ArrayType, type-fest.type-fest/source/internal.FirstArrayElement<Tuple>, Options>, ...type-fest.type-fest/source/merge-deep.MergeArrayTypeAndTuple<ArrayType, type-fest.type-fest/source/internal.ArrayTail<Tuple>, Options>]
    }}}
    */
  @js.native
  trait MergeArrayTypeAndTuple[ArrayType, Tuple /* <: UnknownArrayOrTuple */, Options /* <: MergeDeepInternalOptions */] extends StObject
  
  type MergeDeep[Destination, Source, Options /* <: MergeDeepOptions */] = MergeDeepWithDefaultOptions[SimplifyDeep[Destination], SimplifyDeep[Source], Options]
  
  /**
  Merge a tuple into an array recursively taking into account a possible rest element.
  */
  type MergeDeepArrayAndTupleRecursive[Destination /* <: UnknownArrayOrTuple */, Source /* <: UnknownArrayOrTuple */, Options /* <: MergeDeepInternalOptions */] = /* import warning: importer.ImportType#apply c repeated non-array type: type-fest.type-fest/source/merge-deep.OmitRestType<Source, []> extends [] ? type-fest.type-fest/source/merge-deep.OmitRestType<Source, []> : [type-fest.type-fest/source/merge-deep.MergeDeepArrayOrTupleElements<Destination[number], type-fest.type-fest/source/internal.FirstArrayElement<type-fest.type-fest/source/merge-deep.OmitRestType<Source, []>>, Options>, ...type-fest.type-fest/source/merge-deep.MergeArrayTypeAndTuple<Destination[number], type-fest.type-fest/source/internal.ArrayTail<type-fest.type-fest/source/merge-deep.OmitRestType<Source, []>>, Options>] */ js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: type-fest.type-fest/source/merge-deep.OmitRestType<Source, []> extends [] ? type-fest.type-fest/source/merge-deep.OmitRestType<Source, []> : [type-fest.type-fest/source/merge-deep.MergeDeepArrayOrTupleElements<Destination[number], type-fest.type-fest/source/internal.FirstArrayElement<type-fest.type-fest/source/merge-deep.OmitRestType<Source, []>>, Options>, ...type-fest.type-fest/source/merge-deep.MergeArrayTypeAndTuple<Destination[number], type-fest.type-fest/source/internal.ArrayTail<type-fest.type-fest/source/merge-deep.OmitRestType<Source, []>>, Options>] */ js.Any
  ]
  
  /**
  Merge two array/tuple according to {@link MergeDeepOptions.recurseIntoArrays recurseIntoArrays} option.
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Options['recurseIntoArrays'] extends true ? type-fest.type-fest/source/merge-deep.MergeDeepArrayOrTupleRecursive<Destination, Source, Options> : type-fest.type-fest/source/merge-deep.DoMergeArrayOrTuple<Destination, Source, Options>
    }}}
    */
  @js.native
  trait MergeDeepArrayOrTuple[Destination /* <: UnknownArrayOrTuple */, Source /* <: UnknownArrayOrTuple */, Options /* <: MergeDeepInternalOptions */] extends StObject
  
  /**
  Try to merge two array/tuple elements or return the source element if the end of the destination is reached or vis-versa.
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Source extends [] ? Destination : Destination extends [] ? Source : type-fest.type-fest/source/merge-deep.MergeDeepOrReturn<Source, Destination, Source, Options>
    }}}
    */
  @js.native
  trait MergeDeepArrayOrTupleElements[Destination, Source, Options /* <: MergeDeepInternalOptions */] extends StObject
  
  /**
  Merge two array/tuple recursively by selecting one of the four strategies according to the type of inputs.
  - tuple/tuple
  - tuple/array
  - array/tuple
  - array/array
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    type-fest.type-fest/source/internal.IsBothExtends<type-fest.type-fest/source/internal.NonEmptyTuple, Destination, Source> extends true ? type-fest.type-fest/source/merge-deep.MergeDeepTupleAndTupleRecursive<Destination, Source, Options> : Destination extends type-fest.type-fest/source/internal.NonEmptyTuple ? type-fest.type-fest/source/merge-deep.MergeDeepTupleAndArrayRecursive<Destination, Source, Options> : Source extends type-fest.type-fest/source/internal.NonEmptyTuple ? type-fest.type-fest/source/merge-deep.MergeDeepArrayAndTupleRecursive<Destination, Source, Options> : type-fest.type-fest/source/merge-deep.MergeDeepArrayRecursive<Destination, Source, Options>
    }}}
    */
  @js.native
  trait MergeDeepArrayOrTupleRecursive[Destination /* <: UnknownArrayOrTuple */, Source /* <: UnknownArrayOrTuple */, Options /* <: MergeDeepInternalOptions */] extends StObject
  
  // 'replace'
  /**
  Merge two arrays recursively.
  If the two arrays are multi-level, we merge deeply, otherwise we merge the first level only.
  Note: The `[number]` accessor is used to test the type of the second level.
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Destination[number] extends type-fest.type-fest/source/internal.UnknownArrayOrTuple ? Source[number] extends type-fest.type-fest/source/internal.UnknownArrayOrTuple ? std.Array<type-fest.type-fest/source/merge-deep.MergeDeepArrayOrTupleRecursive<Destination[number], Source[number], Options>> : type-fest.type-fest/source/merge-deep.DoMergeArrayOrTuple<Destination, Source, Options> : Destination[number] extends type-fest.type-fest/source/internal.UnknownRecord ? Source[number] extends type-fest.type-fest/source/internal.UnknownRecord ? std.Array<type-fest.type-fest/source/merge-deep.SimplifyDeep<type-fest.type-fest/source/merge-deep.MergeDeepRecord<Destination[number], Source[number], Options>>> : type-fest.type-fest/source/merge-deep.DoMergeArrayOrTuple<Destination, Source, Options> : type-fest.type-fest/source/merge-deep.DoMergeArrayOrTuple<Destination, Source, Options>
    }}}
    */
  @js.native
  trait MergeDeepArrayRecursive[Destination /* <: UnknownArrayOrTuple */, Source /* <: UnknownArrayOrTuple */, Options /* <: MergeDeepInternalOptions */] extends StObject
  
  /**
  Internal options.
  */
  /* Inlined type-fest.type-fest/source/merge.Merge<type-fest.type-fest/source/merge-deep.MergeDeepOptions, {  spreadTopLevelArrays :boolean | undefined}> */
  trait MergeDeepInternalOptions extends StObject {
    
    var arrayMergeMode: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'arrayMergeMode' extends keyof / * Inlined type-fest.type-fest/source/pick-index-signature.PickIndexSignature<{  spreadTopLevelArrays :boolean | undefined}> * /
    {  spreadTopLevelArrays :boolean | undefined | undefined} ? any | undefined : 'arrayMergeMode' extends keyof / * Inlined type-fest.type-fest/source/pick-index-signature.PickIndexSignature<type-fest.type-fest/source/merge-deep.MergeDeepOptions> * /
    {  arrayMergeMode :type-fest.type-fest/source/merge-deep.ArrayMergeMode | undefined | undefined,   recurseIntoArrays :boolean | undefined | undefined} ? type-fest.type-fest/source/merge-deep.ArrayMergeMode | undefined | undefined : never */ js.Any
      ] = js.undefined
    
    var recurseIntoArrays: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'recurseIntoArrays' extends keyof / * Inlined type-fest.type-fest/source/pick-index-signature.PickIndexSignature<{  spreadTopLevelArrays :boolean | undefined}> * /
    {  spreadTopLevelArrays :boolean | undefined | undefined} ? any | undefined : 'recurseIntoArrays' extends keyof / * Inlined type-fest.type-fest/source/pick-index-signature.PickIndexSignature<type-fest.type-fest/source/merge-deep.MergeDeepOptions> * /
    {  arrayMergeMode :type-fest.type-fest/source/merge-deep.ArrayMergeMode | undefined | undefined,   recurseIntoArrays :boolean | undefined | undefined} ? boolean | undefined | undefined : never */ js.Any
      ] = js.undefined
    
    var spreadTopLevelArrays: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'spreadTopLevelArrays' extends keyof / * Inlined type-fest.type-fest/source/pick-index-signature.PickIndexSignature<{  spreadTopLevelArrays :boolean | undefined}> * /
    {  spreadTopLevelArrays :boolean | undefined | undefined} ? boolean | undefined | undefined : 'spreadTopLevelArrays' extends keyof / * Inlined type-fest.type-fest/source/pick-index-signature.PickIndexSignature<type-fest.type-fest/source/merge-deep.MergeDeepOptions> * /
    {  arrayMergeMode :type-fest.type-fest/source/merge-deep.ArrayMergeMode | undefined | undefined,   recurseIntoArrays :boolean | undefined | undefined} ? any | undefined : never */ js.Any
      ] = js.undefined
  }
  object MergeDeepInternalOptions {
    
    inline def apply(): MergeDeepInternalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergeDeepInternalOptions]
    }
    
    extension [Self <: MergeDeepInternalOptions](x: Self) {
      
      inline def setArrayMergeMode(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'arrayMergeMode' extends keyof / * Inlined type-fest.type-fest/source/pick-index-signature.PickIndexSignature<{  spreadTopLevelArrays :boolean | undefined}> * /
      {  spreadTopLevelArrays :boolean | undefined | undefined} ? any | undefined : 'arrayMergeMode' extends keyof / * Inlined type-fest.type-fest/source/pick-index-signature.PickIndexSignature<type-fest.type-fest/source/merge-deep.MergeDeepOptions> * /
      {  arrayMergeMode :type-fest.type-fest/source/merge-deep.ArrayMergeMode | undefined | undefined,   recurseIntoArrays :boolean | undefined | undefined} ? type-fest.type-fest/source/merge-deep.ArrayMergeMode | undefined | undefined : never */ js.Any
      ): Self = StObject.set(x, "arrayMergeMode", value.asInstanceOf[js.Any])
      
      inline def setArrayMergeModeUndefined: Self = StObject.set(x, "arrayMergeMode", js.undefined)
      
      inline def setRecurseIntoArrays(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'recurseIntoArrays' extends keyof / * Inlined type-fest.type-fest/source/pick-index-signature.PickIndexSignature<{  spreadTopLevelArrays :boolean | undefined}> * /
      {  spreadTopLevelArrays :boolean | undefined | undefined} ? any | undefined : 'recurseIntoArrays' extends keyof / * Inlined type-fest.type-fest/source/pick-index-signature.PickIndexSignature<type-fest.type-fest/source/merge-deep.MergeDeepOptions> * /
      {  arrayMergeMode :type-fest.type-fest/source/merge-deep.ArrayMergeMode | undefined | undefined,   recurseIntoArrays :boolean | undefined | undefined} ? boolean | undefined | undefined : never */ js.Any
      ): Self = StObject.set(x, "recurseIntoArrays", value.asInstanceOf[js.Any])
      
      inline def setRecurseIntoArraysUndefined: Self = StObject.set(x, "recurseIntoArrays", js.undefined)
      
      inline def setSpreadTopLevelArrays(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'spreadTopLevelArrays' extends keyof / * Inlined type-fest.type-fest/source/pick-index-signature.PickIndexSignature<{  spreadTopLevelArrays :boolean | undefined}> * /
      {  spreadTopLevelArrays :boolean | undefined | undefined} ? boolean | undefined | undefined : 'spreadTopLevelArrays' extends keyof / * Inlined type-fest.type-fest/source/pick-index-signature.PickIndexSignature<type-fest.type-fest/source/merge-deep.MergeDeepOptions> * /
      {  arrayMergeMode :type-fest.type-fest/source/merge-deep.ArrayMergeMode | undefined | undefined,   recurseIntoArrays :boolean | undefined | undefined} ? any | undefined : never */ js.Any
      ): Self = StObject.set(x, "spreadTopLevelArrays", value.asInstanceOf[js.Any])
      
      inline def setSpreadTopLevelArraysUndefined: Self = StObject.set(x, "spreadTopLevelArrays", js.undefined)
    }
  }
  
  trait MergeDeepOptions extends StObject {
    
    /**
    	Merge mode for array and tuple.
    	When we walk through the properties of the objects and the same key is found and both are array or tuple, a merge mode must be chosen:
    	- `replace`: Replaces the destination value by the source value. This is the default mode.
    	- `spread`: Spreads the destination and the source values.
    	See {@link MergeDeep} for usages and examples.
    	Note: Top-level arrays and tuples are always spread.
    	@default 'spread'
    	*/
    var arrayMergeMode: js.UndefOr[ArrayMergeMode] = js.undefined
    
    /**
    	Whether to affect the individual elements of arrays and tuples.
    	If this option is set to `true` the following rules are applied:
    	- If the source does not contain the key, the value of the destination is returned.
    	- If the source contains the key and the destination does not contain the key, the value of the source is returned.
    	- If both contain the key, try to merge according to the chosen {@link MergeDeepOptions.arrayMergeMode arrayMergeMode} or return the source if unable to merge.
    	@default false
    	*/
    var recurseIntoArrays: js.UndefOr[Boolean] = js.undefined
  }
  object MergeDeepOptions {
    
    inline def apply(): MergeDeepOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergeDeepOptions]
    }
    
    extension [Self <: MergeDeepOptions](x: Self) {
      
      inline def setArrayMergeMode(value: ArrayMergeMode): Self = StObject.set(x, "arrayMergeMode", value.asInstanceOf[js.Any])
      
      inline def setArrayMergeModeUndefined: Self = StObject.set(x, "arrayMergeMode", js.undefined)
      
      inline def setRecurseIntoArrays(value: Boolean): Self = StObject.set(x, "recurseIntoArrays", value.asInstanceOf[js.Any])
      
      inline def setRecurseIntoArraysUndefined: Self = StObject.set(x, "recurseIntoArrays", js.undefined)
    }
  }
  
  /**
  Try to merge two objects or two arrays/tuples recursively into a new type or return the default value.
  */
  type MergeDeepOrReturn[DefaultType, Destination, Source, Options /* <: MergeDeepInternalOptions */] = SimplifyDeep[
    /* import warning: importer.ImportType#apply Failed type conversion: [undefined] extends [Destination | Source] ? DefaultType : Destination extends type-fest.type-fest/source/internal.UnknownRecord ? Source extends type-fest.type-fest/source/internal.UnknownRecord ? type-fest.type-fest/source/merge-deep.MergeDeepRecord<Destination, Source, Options> : DefaultType : Destination extends type-fest.type-fest/source/internal.UnknownArrayOrTuple ? Source extends type-fest.type-fest/source/internal.UnknownArrayOrTuple ? type-fest.type-fest/source/merge-deep.MergeDeepArrayOrTuple<Destination, Source, type-fest.type-fest/source/merge.Merge<Options, {  spreadTopLevelArrays :false}>> : DefaultType : DefaultType */ js.Any
  ]
  
  /**
  Wrapper around {@link DoMergeDeepRecord} which preserves index signatures.
  */
  type MergeDeepRecord[Destination /* <: UnknownRecord */, Source /* <: UnknownRecord */, Options /* <: MergeDeepInternalOptions */] = (DoMergeDeepRecord[OmitIndexSignature[Destination], OmitIndexSignature[Source], Options]) & (Merge[PickIndexSignature[Destination], PickIndexSignature[Source]])
  
  /**
  Try to merge two record properties or return the source property value, preserving `undefined` properties values in both cases.
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    undefined extends Source ? type-fest.type-fest/source/merge-deep.MergeDeepOrReturn<Source, std.Exclude<Destination, undefined>, std.Exclude<Source, undefined>, Options> | undefined : type-fest.type-fest/source/merge-deep.MergeDeepOrReturn<Source, Destination, Source, Options>
    }}}
    */
  @js.native
  trait MergeDeepRecordProperty[Destination, Source, Options /* <: MergeDeepInternalOptions */] extends StObject
  
  /**
  Merge an array into a tuple recursively taking into account a possible rest element.
  */
  type MergeDeepTupleAndArrayRecursive[Destination /* <: UnknownArrayOrTuple */, Source /* <: UnknownArrayOrTuple */, Options /* <: MergeDeepInternalOptions */] = /* import warning: importer.ImportType#apply c repeated non-array type: type-fest.type-fest/source/merge-deep.OmitRestType<Destination, []> extends [] ? type-fest.type-fest/source/merge-deep.OmitRestType<Destination, []> : [type-fest.type-fest/source/merge-deep.MergeDeepArrayOrTupleElements<type-fest.type-fest/source/internal.FirstArrayElement<type-fest.type-fest/source/merge-deep.OmitRestType<Destination, []>>, Source[number], Options>, ...type-fest.type-fest/source/merge-deep.MergeTupleAndArrayType<type-fest.type-fest/source/internal.ArrayTail<type-fest.type-fest/source/merge-deep.OmitRestType<Destination, []>>, Source[number], Options>] */ js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: type-fest.type-fest/source/merge-deep.OmitRestType<Destination, []> extends [] ? type-fest.type-fest/source/merge-deep.OmitRestType<Destination, []> : [type-fest.type-fest/source/merge-deep.MergeDeepArrayOrTupleElements<type-fest.type-fest/source/internal.FirstArrayElement<type-fest.type-fest/source/merge-deep.OmitRestType<Destination, []>>, Source[number], Options>, ...type-fest.type-fest/source/merge-deep.MergeTupleAndArrayType<type-fest.type-fest/source/internal.ArrayTail<type-fest.type-fest/source/merge-deep.OmitRestType<Destination, []>>, Source[number], Options>] */ js.Any
  ]
  
  /**
  Merge two tuples recursively taking into account a possible rest element.
  */
  type MergeDeepTupleAndTupleRecursive[Destination /* <: UnknownArrayOrTuple */, Source /* <: UnknownArrayOrTuple */, Options /* <: MergeDeepInternalOptions */] = /* import warning: importer.ImportType#apply c repeated non-array type: type-fest.type-fest/source/merge-deep.OmitRestType<Destination, []> extends [] ? type-fest.type-fest/source/merge-deep.OmitRestType<Source, []> extends [] ? [] : type-fest.type-fest/source/merge-deep.MergeArrayTypeAndTuple<type-fest.type-fest/source/merge-deep.PickRestTypeFlat<Destination>, type-fest.type-fest/source/merge-deep.OmitRestType<Source, []>, Options> : type-fest.type-fest/source/merge-deep.OmitRestType<Source, []> extends [] ? type-fest.type-fest/source/merge-deep.MergeTupleAndArrayType<type-fest.type-fest/source/merge-deep.OmitRestType<Destination, []>, type-fest.type-fest/source/merge-deep.PickRestTypeFlat<Source>, Options> : [type-fest.type-fest/source/merge-deep.MergeDeepArrayOrTupleElements<type-fest.type-fest/source/internal.FirstArrayElement<type-fest.type-fest/source/merge-deep.OmitRestType<Destination, []>>, type-fest.type-fest/source/internal.FirstArrayElement<type-fest.type-fest/source/merge-deep.OmitRestType<Source, []>>, Options>, ...type-fest.type-fest/source/merge-deep.DoMergeDeepTupleAndTupleRecursive<type-fest.type-fest/source/internal.ArrayTail<type-fest.type-fest/source/merge-deep.OmitRestType<Destination, []>>, type-fest.type-fest/source/internal.ArrayTail<type-fest.type-fest/source/merge-deep.OmitRestType<Source, []>>, type-fest.type-fest/source/merge-deep.PickRestTypeFlat<Destination>, type-fest.type-fest/source/merge-deep.PickRestTypeFlat<Source>, Options>] */ js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: type-fest.type-fest/source/merge-deep.OmitRestType<Destination, []> extends [] ? type-fest.type-fest/source/merge-deep.OmitRestType<Source, []> extends [] ? [] : type-fest.type-fest/source/merge-deep.MergeArrayTypeAndTuple<type-fest.type-fest/source/merge-deep.PickRestTypeFlat<Destination>, type-fest.type-fest/source/merge-deep.OmitRestType<Source, []>, Options> : type-fest.type-fest/source/merge-deep.OmitRestType<Source, []> extends [] ? type-fest.type-fest/source/merge-deep.MergeTupleAndArrayType<type-fest.type-fest/source/merge-deep.OmitRestType<Destination, []>, type-fest.type-fest/source/merge-deep.PickRestTypeFlat<Source>, Options> : [type-fest.type-fest/source/merge-deep.MergeDeepArrayOrTupleElements<type-fest.type-fest/source/internal.FirstArrayElement<type-fest.type-fest/source/merge-deep.OmitRestType<Destination, []>>, type-fest.type-fest/source/internal.FirstArrayElement<type-fest.type-fest/source/merge-deep.OmitRestType<Source, []>>, Options>, ...type-fest.type-fest/source/merge-deep.DoMergeDeepTupleAndTupleRecursive<type-fest.type-fest/source/internal.ArrayTail<type-fest.type-fest/source/merge-deep.OmitRestType<Destination, []>>, type-fest.type-fest/source/internal.ArrayTail<type-fest.type-fest/source/merge-deep.OmitRestType<Source, []>>, type-fest.type-fest/source/merge-deep.PickRestTypeFlat<Destination>, type-fest.type-fest/source/merge-deep.PickRestTypeFlat<Source>, Options>] */ js.Any
  ]
  
  /**
  This utility selects the correct entry point with the corresponding default options. This avoids re-merging the options at each iteration.
  */
  type MergeDeepWithDefaultOptions[Destination, Source, Options /* <: MergeDeepOptions */] = SimplifyDeep[
    /* import warning: importer.ImportType#apply Failed type conversion: [undefined] extends [Destination | Source] ? never : Destination extends type-fest.type-fest/source/internal.UnknownRecord ? Source extends type-fest.type-fest/source/internal.UnknownRecord ? type-fest.type-fest/source/merge-deep.MergeDeepRecord<Destination, Source, type-fest.type-fest/source/merge-deep.DefaultMergeDeepOptions<Options>> : never : Destination extends type-fest.type-fest/source/internal.UnknownArrayOrTuple ? Source extends type-fest.type-fest/source/internal.UnknownArrayOrTuple ? type-fest.type-fest/source/merge-deep.MergeDeepArrayOrTuple<Destination, Source, type-fest.type-fest/source/merge-deep.DefaultMergeDeepOptions<Options>> : never : never */ js.Any
  ]
  
  /**
  Merge an array type with a tuple recursively.
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Tuple extends [] ? Tuple : [type-fest.type-fest/source/merge-deep.MergeDeepArrayOrTupleElements<type-fest.type-fest/source/internal.FirstArrayElement<Tuple>, ArrayType, Options>, ...type-fest.type-fest/source/merge-deep.MergeTupleAndArrayType<type-fest.type-fest/source/internal.ArrayTail<Tuple>, ArrayType, Options>]
    }}}
    */
  @js.native
  trait MergeTupleAndArrayType[Tuple /* <: UnknownArrayOrTuple */, ArrayType, Options /* <: MergeDeepInternalOptions */] extends StObject
  
  /**
  Omit the rest type.
  @example
  ```
  type Tuple1 = OmitRestType<[]>; // => []
  type Tuple2 = OmitRestType<[string]>; // => [string]
  type Tuple3 = OmitRestType<[...number[]]>; // => []
  type Tuple4 = OmitRestType<[string, ...number[]]>; // => [string]
  type Tuple5 = OmitRestType<[string, boolean[], ...number[]]>; // => [string, boolean[]]
  type Tuple6 = OmitRestType<string[]>; // => []
  ```
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    number extends Type['length'] ? type-fest.type-fest/source/internal.ArrayTail<Type> extends [] ? Result : type-fest.type-fest/source/merge-deep.OmitRestType<type-fest.type-fest/source/internal.ArrayTail<Type>, [...Result, type-fest.type-fest/source/internal.FirstArrayElement<Type>]> : Type
    }}}
    */
  @js.native
  trait OmitRestType[Type /* <: UnknownArrayOrTuple */, Result /* <: UnknownArrayOrTuple */] extends StObject
  
  /**
  Pick the rest type.
  @example
  ```
  type Rest1 = PickRestType<[]>; // => []
  type Rest2 = PickRestType<[string]>; // => []
  type Rest3 = PickRestType<[...number[]]>; // => number[]
  type Rest4 = PickRestType<[string, ...number[]]>; // => number[]
  type Rest5 = PickRestType<string[]>; // => string[]
  ```
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    number extends Type['length'] ? type-fest.type-fest/source/internal.ArrayTail<Type> extends [] ? Type : type-fest.type-fest/source/merge-deep.PickRestType<type-fest.type-fest/source/internal.ArrayTail<Type>> : []
    }}}
    */
  @js.native
  trait PickRestType[Type /* <: UnknownArrayOrTuple */] extends StObject
  
  // Pick the rest type (array) and try to get the intrinsic type or return the provided type.
  type PickRestTypeFlat[Type /* <: UnknownArrayOrTuple */] = TypeNumberOrType[PickRestType[Type]]
  
  /**
  Test if it sould spread top-level arrays.
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Options['spreadTopLevelArrays'] extends false ? Options['arrayMergeMode'] extends 'spread' ? true : false : true
    }}}
    */
  @js.native
  trait ShouldSpread[Options /* <: MergeDeepInternalOptions */] extends StObject
  
  /**
  Deeply smplifies an object excluding iterables and functions. Used internally to improve the UX and accept both interfaces and type aliases as inputs.
  */
  type SimplifyDeep[Type] = ConditionalSimplifyDeep[Type, js.Function | js.Iterable[Any], js.Object]
  
  // Utility to avoid picking two times the type.
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Type[number] extends never ? Type : Type[number]
    }}}
    */
  @js.native
  trait TypeNumberOrType[Type /* <: UnknownArrayOrTuple */] extends StObject
}
