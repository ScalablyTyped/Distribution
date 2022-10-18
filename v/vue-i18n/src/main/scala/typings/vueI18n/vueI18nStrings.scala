package typings.vueI18n

import typings.vueI18n.mod.ComponetI18nScope
import typings.vueI18n.mod.I18nMode
import typings.vueI18n.mod.I18nScope
import typings.vueI18n.mod.WarnHtmlInMessageLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vueI18nStrings {
  
  @js.native
  sealed trait composition
    extends StObject
       with I18nMode
  inline def composition: composition = "composition".asInstanceOf[composition]
  
  @js.native
  sealed trait `en-US` extends StObject
  inline def `en-US`: `en-US` = "en-US".asInstanceOf[`en-US`]
  
  @js.native
  sealed trait error
    extends StObject
       with WarnHtmlInMessageLevel
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait global
    extends StObject
       with ComponetI18nScope
       with I18nScope
  inline def global: global = "global".asInstanceOf[global]
  
  @js.native
  sealed trait legacy
    extends StObject
       with I18nMode
  inline def legacy: legacy = "legacy".asInstanceOf[legacy]
  
  @js.native
  sealed trait local
    extends StObject
       with I18nScope
  inline def local: local = "local".asInstanceOf[local]
  
  @js.native
  sealed trait off
    extends StObject
       with WarnHtmlInMessageLevel
  inline def off: off = "off".asInstanceOf[off]
  
  @js.native
  sealed trait parent
    extends StObject
       with ComponetI18nScope
       with I18nScope
  inline def parent: parent = "parent".asInstanceOf[parent]
  
  @js.native
  sealed trait warn
    extends StObject
       with WarnHtmlInMessageLevel
  inline def warn: warn = "warn".asInstanceOf[warn]
}
