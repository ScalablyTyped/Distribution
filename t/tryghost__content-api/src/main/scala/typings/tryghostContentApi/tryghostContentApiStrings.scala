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
  @scala.inline
  def authors: authors = "authors".asInstanceOf[authors]
  
  @js.native
  sealed trait canary extends StObject
  @scala.inline
  def canary: canary = "canary".asInstanceOf[canary]
  
  @js.native
  sealed trait countDotposts
    extends StObject
       with IncludeParam
  @scala.inline
  def countDotposts: countDotposts = "count.posts".asInstanceOf[countDotposts]
  
  @js.native
  sealed trait html
    extends StObject
       with FormatParam
  @scala.inline
  def html: html = "html".asInstanceOf[html]
  
  @js.native
  sealed trait internal
    extends StObject
       with TagVisibility
  @scala.inline
  def internal: internal = "internal".asInstanceOf[internal]
  
  @js.native
  sealed trait plaintext
    extends StObject
       with FormatParam
  @scala.inline
  def plaintext: plaintext = "plaintext".asInstanceOf[plaintext]
  
  @js.native
  sealed trait public
    extends StObject
       with TagVisibility
  @scala.inline
  def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait tags
    extends StObject
       with IncludeParam
  @scala.inline
  def tags: tags = "tags".asInstanceOf[tags]
  
  @js.native
  sealed trait v2 extends StObject
  @scala.inline
  def v2: v2 = "v2".asInstanceOf[v2]
  
  @js.native
  sealed trait v3 extends StObject
  @scala.inline
  def v3: v3 = "v3".asInstanceOf[v3]
}
