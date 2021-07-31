package typings.useMediaAntdQuery

import typings.useMediaAntdQuery.anon.MatchMedia
import typings.useMediaAntdQuery.anon.MaxWidth
import typings.useMediaAntdQuery.anon.MinWidth
import typings.useMediaAntdQuery.useMediaAntdQueryStrings.lg
import typings.useMediaAntdQuery.useMediaAntdQueryStrings.md
import typings.useMediaAntdQuery.useMediaAntdQueryStrings.sm
import typings.useMediaAntdQuery.useMediaAntdQueryStrings.xl
import typings.useMediaAntdQuery.useMediaAntdQueryStrings.xs
import typings.useMediaAntdQuery.useMediaAntdQueryStrings.xxl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-media-antd-query", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): xs | sm | md | lg | xl | xxl = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[xs | sm | md | lg | xl | xxl]
  
  object MediaQueryEnum {
    
    @JSImport("use-media-antd-query", "MediaQueryEnum")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("use-media-antd-query", "MediaQueryEnum.lg")
    @js.native
    def lg: MaxWidth = js.native
    @scala.inline
    def lg_=(x: MaxWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lg")(x.asInstanceOf[js.Any])
    
    @JSImport("use-media-antd-query", "MediaQueryEnum.md")
    @js.native
    def md: MaxWidth = js.native
    @scala.inline
    def md_=(x: MaxWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("md")(x.asInstanceOf[js.Any])
    
    @JSImport("use-media-antd-query", "MediaQueryEnum.sm")
    @js.native
    def sm: MaxWidth = js.native
    @scala.inline
    def sm_=(x: MaxWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sm")(x.asInstanceOf[js.Any])
    
    @JSImport("use-media-antd-query", "MediaQueryEnum.xl")
    @js.native
    def xl: MaxWidth = js.native
    @scala.inline
    def xl_=(x: MaxWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xl")(x.asInstanceOf[js.Any])
    
    @JSImport("use-media-antd-query", "MediaQueryEnum.xs")
    @js.native
    def xs: MatchMedia = js.native
    @scala.inline
    def xs_=(x: MatchMedia): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xs")(x.asInstanceOf[js.Any])
    
    @JSImport("use-media-antd-query", "MediaQueryEnum.xxl")
    @js.native
    def xxl: MinWidth = js.native
    @scala.inline
    def xxl_=(x: MinWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xxl")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def getScreenClassName(): xs | sm | md | lg | xl | xxl = ^.asInstanceOf[js.Dynamic].applyDynamic("getScreenClassName")().asInstanceOf[xs | sm | md | lg | xl | xxl]
  
  /* keyof use-media-antd-query.anon.Lg */ /* Rewritten from type alias, can be one of: 
    - typings.useMediaAntdQuery.useMediaAntdQueryStrings.xs
    - typings.useMediaAntdQuery.useMediaAntdQueryStrings.sm
    - typings.useMediaAntdQuery.useMediaAntdQueryStrings.md
    - typings.useMediaAntdQuery.useMediaAntdQueryStrings.lg
    - typings.useMediaAntdQuery.useMediaAntdQueryStrings.xl
    - typings.useMediaAntdQuery.useMediaAntdQueryStrings.xxl
  */
  trait MediaQueryKey extends StObject
}
