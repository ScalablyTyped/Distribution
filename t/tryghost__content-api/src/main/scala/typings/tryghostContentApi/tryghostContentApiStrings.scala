package typings.tryghostContentApi

import typings.tryghostContentApi.mod.FormatParam
import typings.tryghostContentApi.mod.IncludeParam
import typings.tryghostContentApi.mod.TagVisibility
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tryghostContentApiStrings {
  
  @js.native
  sealed trait authors
    extends StObject
       with IncludeParam
  inline def authors: authors = "authors".asInstanceOf[authors]
  
  @js.native
  sealed trait canary extends StObject
  inline def canary: canary = "canary".asInstanceOf[canary]
  
  @js.native
  sealed trait countDotposts
    extends StObject
       with IncludeParam
  inline def countDotposts: countDotposts = "count.posts".asInstanceOf[countDotposts]
  
  @js.native
  sealed trait html
    extends StObject
       with FormatParam
  inline def html: html = "html".asInstanceOf[html]
  
  @js.native
  sealed trait internal
    extends StObject
       with TagVisibility
  inline def internal: internal = "internal".asInstanceOf[internal]
  
  @js.native
  sealed trait plaintext
    extends StObject
       with FormatParam
  inline def plaintext: plaintext = "plaintext".asInstanceOf[plaintext]
  
  @js.native
  sealed trait public
    extends StObject
       with TagVisibility
  inline def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait tags
    extends StObject
       with IncludeParam
  inline def tags: tags = "tags".asInstanceOf[tags]
  
  @js.native
  sealed trait v2 extends StObject
  inline def v2: v2 = "v2".asInstanceOf[v2]
  
  @js.native
  sealed trait v3 extends StObject
  inline def v3: v3 = "v3".asInstanceOf[v3]
  
  @js.native
  sealed trait v4 extends StObject
  inline def v4: v4 = "v4".asInstanceOf[v4]
  
  @js.native
  sealed trait v5Dot0 extends StObject
  inline def v5Dot0: v5Dot0 = "v5.0".asInstanceOf[v5Dot0]
}
