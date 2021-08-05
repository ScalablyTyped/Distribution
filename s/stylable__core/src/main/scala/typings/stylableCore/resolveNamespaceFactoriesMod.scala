package typings.stylableCore

import typings.stylableCore.anon.Cwd
import typings.stylableCore.anon.Dirname
import typings.stylableCore.anon.Prefix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveNamespaceFactoriesMod {
  
  @JSImport("@stylable/core/cjs/resolve-namespace-factories", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def noCollisionNamespace(): js.Function2[/* namespace */ String, /* source */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("noCollisionNamespace")().asInstanceOf[js.Function2[/* namespace */ String, /* source */ String, String]]
  inline def noCollisionNamespace(hasPrefixUsedNamespaces: Prefix): js.Function2[/* namespace */ String, /* source */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("noCollisionNamespace")(hasPrefixUsedNamespaces.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* namespace */ String, /* source */ String, String]]
  
  inline def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname
  ): js.Function2[/* namespace */ String, /* source */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("packageNamespaceFactory")(findConfig.asInstanceOf[js.Any], loadConfig.asInstanceOf[js.Any], hasDirnameRelative.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* namespace */ String, /* source */ String, String]]
  inline def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname,
    hashSalt: String
  ): js.Function2[/* namespace */ String, /* source */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("packageNamespaceFactory")(findConfig.asInstanceOf[js.Any], loadConfig.asInstanceOf[js.Any], hasDirnameRelative.asInstanceOf[js.Any], hashSalt.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* namespace */ String, /* source */ String, String]]
  inline def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname,
    hashSalt: String,
    prefix: String
  ): js.Function2[/* namespace */ String, /* source */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("packageNamespaceFactory")(findConfig.asInstanceOf[js.Any], loadConfig.asInstanceOf[js.Any], hasDirnameRelative.asInstanceOf[js.Any], hashSalt.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* namespace */ String, /* source */ String, String]]
  inline def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname,
    hashSalt: String,
    prefix: String,
    normalizeVersion: js.Function1[/* semver */ String, String]
  ): js.Function2[/* namespace */ String, /* source */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("packageNamespaceFactory")(findConfig.asInstanceOf[js.Any], loadConfig.asInstanceOf[js.Any], hasDirnameRelative.asInstanceOf[js.Any], hashSalt.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], normalizeVersion.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* namespace */ String, /* source */ String, String]]
  inline def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname,
    hashSalt: String,
    prefix: Unit,
    normalizeVersion: js.Function1[/* semver */ String, String]
  ): js.Function2[/* namespace */ String, /* source */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("packageNamespaceFactory")(findConfig.asInstanceOf[js.Any], loadConfig.asInstanceOf[js.Any], hasDirnameRelative.asInstanceOf[js.Any], hashSalt.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], normalizeVersion.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* namespace */ String, /* source */ String, String]]
  inline def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname,
    hashSalt: Unit,
    prefix: String
  ): js.Function2[/* namespace */ String, /* source */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("packageNamespaceFactory")(findConfig.asInstanceOf[js.Any], loadConfig.asInstanceOf[js.Any], hasDirnameRelative.asInstanceOf[js.Any], hashSalt.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* namespace */ String, /* source */ String, String]]
  inline def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname,
    hashSalt: Unit,
    prefix: String,
    normalizeVersion: js.Function1[/* semver */ String, String]
  ): js.Function2[/* namespace */ String, /* source */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("packageNamespaceFactory")(findConfig.asInstanceOf[js.Any], loadConfig.asInstanceOf[js.Any], hasDirnameRelative.asInstanceOf[js.Any], hashSalt.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], normalizeVersion.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* namespace */ String, /* source */ String, String]]
  inline def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname,
    hashSalt: Unit,
    prefix: Unit,
    normalizeVersion: js.Function1[/* semver */ String, String]
  ): js.Function2[/* namespace */ String, /* source */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("packageNamespaceFactory")(findConfig.asInstanceOf[js.Any], loadConfig.asInstanceOf[js.Any], hasDirnameRelative.asInstanceOf[js.Any], hashSalt.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], normalizeVersion.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* namespace */ String, /* source */ String, String]]
}
