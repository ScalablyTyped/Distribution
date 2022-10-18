package typings.typesEslintrc

import typings.typesEslintrc.buildMod.ESLintSeverity
import typings.typesEslintrc.buildMod._ESLintGlobalPermission
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEslintrcStrings {
  
  @js.native
  sealed trait `@babelSlasheslint-parser` extends StObject
  inline def `@babelSlasheslint-parser`: `@babelSlasheslint-parser` = "@babel/eslint-parser".asInstanceOf[`@babelSlasheslint-parser`]
  
  @js.native
  sealed trait `@typescript-eslintSlashparser` extends StObject
  inline def `@typescript-eslintSlashparser`: `@typescript-eslintSlashparser` = "@typescript-eslint/parser".asInstanceOf[`@typescript-eslintSlashparser`]
  
  @js.native
  sealed trait error
    extends StObject
       with ESLintSeverity
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait esprima extends StObject
  inline def esprima: esprima = "esprima".asInstanceOf[esprima]
  
  @js.native
  sealed trait module extends StObject
  inline def module: module = "module".asInstanceOf[module]
  
  @js.native
  sealed trait off
    extends StObject
       with ESLintSeverity
       with _ESLintGlobalPermission
  inline def off: off = "off".asInstanceOf[off]
  
  @js.native
  sealed trait readable
    extends StObject
       with _ESLintGlobalPermission
  inline def readable: readable = "readable".asInstanceOf[readable]
  
  @js.native
  sealed trait readonly
    extends StObject
       with _ESLintGlobalPermission
  inline def readonly: readonly = "readonly".asInstanceOf[readonly]
  
  @js.native
  sealed trait script extends StObject
  inline def script: script = "script".asInstanceOf[script]
  
  @js.native
  sealed trait warn
    extends StObject
       with ESLintSeverity
  inline def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait writable
    extends StObject
       with _ESLintGlobalPermission
  inline def writable: writable = "writable".asInstanceOf[writable]
}
