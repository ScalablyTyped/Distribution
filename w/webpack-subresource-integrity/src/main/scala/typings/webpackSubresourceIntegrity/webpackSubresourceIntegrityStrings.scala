package typings.webpackSubresourceIntegrity

import typings.webpackSubresourceIntegrity.distCjsTypesMod.AssetType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webpackSubresourceIntegrityStrings {
  
  @js.native
  sealed trait auto extends StObject
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait css
    extends StObject
       with AssetType
       with typings.webpackSubresourceIntegrity.distMjsTypesMod.AssetType
  inline def css: css = "css".asInstanceOf[css]
  
  @js.native
  sealed trait eager extends StObject
  inline def eager: eager = "eager".asInstanceOf[eager]
  
  @js.native
  sealed trait js_
    extends StObject
       with AssetType
       with typings.webpackSubresourceIntegrity.distMjsTypesMod.AssetType
  inline def js_ : js_ = "js".asInstanceOf[js_]
  
  @js.native
  sealed trait `lazy` extends StObject
  inline def `lazy`: `lazy` = "lazy".asInstanceOf[`lazy`]
}
