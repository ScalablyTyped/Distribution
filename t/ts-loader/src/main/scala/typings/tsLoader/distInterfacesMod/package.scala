package typings.tsLoader.distInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.std.WeakMap
import typings.tsLoader.anon.Callbacks
import typings.tsLoader.anon.FnCallTypeReferenceDirectiveNameContainingFileOptionsHostRedirectedReferenceCacheResolutionMode
import typings.tsLoader.tsLoaderBooleans.`true`
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ModuleResolutionHost
import typings.typescript.mod.ResolvedModuleWithFailedLookupLocations
import typings.typescript.mod.ResolvedTypeReferenceDirectiveWithFailedLookupLocations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CustomResolveModuleName = js.Function5[
/* moduleName */ String, 
/* containingFile */ String, 
/* compilerOptions */ CompilerOptions, 
/* moduleResolutionHost */ ModuleResolutionHost, 
/* parentResolver */ ResolveModuleName, 
ResolvedModuleWithFailedLookupLocations]

type CustomResolveTypeReferenceDirective = js.Function5[
/* typeDirectiveName */ String, 
/* containingFile */ String, 
/* compilerOptions */ CompilerOptions, 
/* moduleResolutionHost */ ModuleResolutionHost, 
/* parentResolver */ FnCallTypeReferenceDirectiveNameContainingFileOptionsHostRedirectedReferenceCacheResolutionMode, 
ResolvedTypeReferenceDirectiveWithFailedLookupLocations]

type DependencyGraph = Map[FilePathKey, js.Array[ResolvedModule]]

type LoaderOptionsCache = StringDictionary[WeakMap[LoaderOptions, LoaderOptions]]

type ResolveModuleName = js.Function4[
/* moduleName */ String, 
/* containingFile */ String, 
/* compilerOptions */ CompilerOptions, 
/* moduleResolutionHost */ ModuleResolutionHost, 
ResolvedModuleWithFailedLookupLocations]

type ReverseDependencyGraph = Map[FilePathKey, Map[FilePathKey, `true`]]

type TSFiles = Map[FilePathKey, TSFile]

type WatchCallbacks[T] = Map[FilePathKey, Callbacks[T]]
