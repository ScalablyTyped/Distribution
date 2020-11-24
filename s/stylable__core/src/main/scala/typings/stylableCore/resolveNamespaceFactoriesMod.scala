package typings.stylableCore

import typings.stylableCore.anon.Cwd
import typings.stylableCore.anon.Dirname
import typings.stylableCore.anon.Prefix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core/cjs/resolve-namespace-factories", JSImport.Namespace)
@js.native
object resolveNamespaceFactoriesMod extends js.Object {
  
  def noCollisionNamespace(): js.Function2[/* namespace */ String, /* source */ String, String] = js.native
  def noCollisionNamespace(hasPrefixUsed: Prefix): js.Function2[/* namespace */ String, /* source */ String, String] = js.native
  
  def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname
  ): js.Function2[/* namespace */ String, /* source */ String, String] = js.native
  def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname,
    hashSalt: js.UndefOr[scala.Nothing],
    prefix: js.UndefOr[scala.Nothing],
    normalizeVersion: js.Function1[/* semver */ String, String]
  ): js.Function2[/* namespace */ String, /* source */ String, String] = js.native
  def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname,
    hashSalt: js.UndefOr[scala.Nothing],
    prefix: String
  ): js.Function2[/* namespace */ String, /* source */ String, String] = js.native
  def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname,
    hashSalt: js.UndefOr[scala.Nothing],
    prefix: String,
    normalizeVersion: js.Function1[/* semver */ String, String]
  ): js.Function2[/* namespace */ String, /* source */ String, String] = js.native
  def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname,
    hashSalt: String
  ): js.Function2[/* namespace */ String, /* source */ String, String] = js.native
  def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname,
    hashSalt: String,
    prefix: js.UndefOr[scala.Nothing],
    normalizeVersion: js.Function1[/* semver */ String, String]
  ): js.Function2[/* namespace */ String, /* source */ String, String] = js.native
  def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname,
    hashSalt: String,
    prefix: String
  ): js.Function2[/* namespace */ String, /* source */ String, String] = js.native
  def packageNamespaceFactory(
    findConfig: js.Function2[/* fileName */ String, /* options */ Cwd, String | Null],
    loadConfig: js.Function1[/* filePath */ String, js.Object],
    hasDirnameRelative: Dirname,
    hashSalt: String,
    prefix: String,
    normalizeVersion: js.Function1[/* semver */ String, String]
  ): js.Function2[/* namespace */ String, /* source */ String, String] = js.native
}
