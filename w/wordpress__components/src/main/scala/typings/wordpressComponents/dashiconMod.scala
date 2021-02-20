package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.SVGProps
import typings.std.SVGSVGElement
import typings.wordpressComponents.dashiconMod.Dashicon.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dashiconMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/dashicon", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object Dashicon {
    
    /* Rewritten from type alias, can be one of: 
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-appearance`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-collapse`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-comments`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-customizer`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-generic`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-home`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-links`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-media`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-multisite`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-network`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-page`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-plugins`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-post`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-settings`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-site-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-site-alt2`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-site-alt3`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-site`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-tools`
      - typings.wordpressComponents.wordpressComponentsStrings.`admin-users`
      - typings.wordpressComponents.wordpressComponentsStrings.album
      - typings.wordpressComponents.wordpressComponentsStrings.`align-center`
      - typings.wordpressComponents.wordpressComponentsStrings.`align-full-width`
      - typings.wordpressComponents.wordpressComponentsStrings.`align-left`
      - typings.wordpressComponents.wordpressComponentsStrings.`align-none`
      - typings.wordpressComponents.wordpressComponentsStrings.`align-pull-left`
      - typings.wordpressComponents.wordpressComponentsStrings.`align-pull-right`
      - typings.wordpressComponents.wordpressComponentsStrings.`align-right`
      - typings.wordpressComponents.wordpressComponentsStrings.`align-wide`
      - typings.wordpressComponents.wordpressComponentsStrings.analytics
      - typings.wordpressComponents.wordpressComponentsStrings.archive
      - typings.wordpressComponents.wordpressComponentsStrings.`arrow-down-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.`arrow-down-alt2`
      - typings.wordpressComponents.wordpressComponentsStrings.`arrow-down`
      - typings.wordpressComponents.wordpressComponentsStrings.`arrow-left-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.`arrow-left-alt2`
      - typings.wordpressComponents.wordpressComponentsStrings.`arrow-left`
      - typings.wordpressComponents.wordpressComponentsStrings.`arrow-right-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.`arrow-right-alt2`
      - typings.wordpressComponents.wordpressComponentsStrings.`arrow-right`
      - typings.wordpressComponents.wordpressComponentsStrings.`arrow-up-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.`arrow-up-alt2`
      - typings.wordpressComponents.wordpressComponentsStrings.`arrow-up`
      - typings.wordpressComponents.wordpressComponentsStrings.art
      - typings.wordpressComponents.wordpressComponentsStrings.awards
      - typings.wordpressComponents.wordpressComponentsStrings.backup
      - typings.wordpressComponents.wordpressComponentsStrings.`block-default`
      - typings.wordpressComponents.wordpressComponentsStrings.`book-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.book
      - typings.wordpressComponents.wordpressComponentsStrings.`buddicons-activity`
      - typings.wordpressComponents.wordpressComponentsStrings.`buddicons-bbpress-logo`
      - typings.wordpressComponents.wordpressComponentsStrings.`buddicons-buddypress-logo`
      - typings.wordpressComponents.wordpressComponentsStrings.`buddicons-community`
      - typings.wordpressComponents.wordpressComponentsStrings.`buddicons-forums`
      - typings.wordpressComponents.wordpressComponentsStrings.`buddicons-friends`
      - typings.wordpressComponents.wordpressComponentsStrings.`buddicons-groups`
      - typings.wordpressComponents.wordpressComponentsStrings.`buddicons-pm`
      - typings.wordpressComponents.wordpressComponentsStrings.`buddicons-replies`
      - typings.wordpressComponents.wordpressComponentsStrings.`buddicons-topics`
      - typings.wordpressComponents.wordpressComponentsStrings.`buddicons-tracking`
      - typings.wordpressComponents.wordpressComponentsStrings.building
      - typings.wordpressComponents.wordpressComponentsStrings.businessman
      - typings.wordpressComponents.wordpressComponentsStrings.button
      - typings.wordpressComponents.wordpressComponentsStrings.`calendar-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.calendar
      - typings.wordpressComponents.wordpressComponentsStrings.camera
      - typings.wordpressComponents.wordpressComponentsStrings.carrot
      - typings.wordpressComponents.wordpressComponentsStrings.cart
      - typings.wordpressComponents.wordpressComponentsStrings.category
      - typings.wordpressComponents.wordpressComponentsStrings.`chart-area`
      - typings.wordpressComponents.wordpressComponentsStrings.`chart-bar`
      - typings.wordpressComponents.wordpressComponentsStrings.`chart-line`
      - typings.wordpressComponents.wordpressComponentsStrings.`chart-pie`
      - typings.wordpressComponents.wordpressComponentsStrings.clipboard
      - typings.wordpressComponents.wordpressComponentsStrings.clock
      - typings.wordpressComponents.wordpressComponentsStrings.`cloud-saved`
      - typings.wordpressComponents.wordpressComponentsStrings.`cloud-upload`
      - typings.wordpressComponents.wordpressComponentsStrings.cloud
      - typings.wordpressComponents.wordpressComponentsStrings.columns
      - typings.wordpressComponents.wordpressComponentsStrings.`controls-back`
      - typings.wordpressComponents.wordpressComponentsStrings.`controls-forward`
      - typings.wordpressComponents.wordpressComponentsStrings.`controls-pause`
      - typings.wordpressComponents.wordpressComponentsStrings.`controls-play`
      - typings.wordpressComponents.wordpressComponentsStrings.`controls-repeat`
      - typings.wordpressComponents.wordpressComponentsStrings.`controls-skipback`
      - typings.wordpressComponents.wordpressComponentsStrings.`controls-skipforward`
      - typings.wordpressComponents.wordpressComponentsStrings.`controls-volumeoff`
      - typings.wordpressComponents.wordpressComponentsStrings.`controls-volumeon`
      - typings.wordpressComponents.wordpressComponentsStrings.`cover-image`
      - typings.wordpressComponents.wordpressComponentsStrings.dashboard
      - typings.wordpressComponents.wordpressComponentsStrings.desktop
      - typings.wordpressComponents.wordpressComponentsStrings.dismiss
      - typings.wordpressComponents.wordpressComponentsStrings.download
      - typings.wordpressComponents.wordpressComponentsStrings.edit
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-aligncenter`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-alignleft`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-alignright`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-bold`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-break`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-code`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-contract`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-customchar`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-expand`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-help`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-indent`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-insertmore`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-italic`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-justify`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-kitchensink`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-ltr`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-ol-rtl`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-ol`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-outdent`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-paragraph`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-paste-text`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-paste-word`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-quote`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-removeformatting`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-rtl`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-spellcheck`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-strikethrough`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-table`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-textcolor`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-ul`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-underline`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-unlink`
      - typings.wordpressComponents.wordpressComponentsStrings.`editor-video`
      - typings.wordpressComponents.wordpressComponentsStrings.ellipsis
      - typings.wordpressComponents.wordpressComponentsStrings.`email-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.`email-alt2`
      - typings.wordpressComponents.wordpressComponentsStrings.email
      - typings.wordpressComponents.wordpressComponentsStrings.`embed-audio`
      - typings.wordpressComponents.wordpressComponentsStrings.`embed-generic`
      - typings.wordpressComponents.wordpressComponentsStrings.`embed-photo`
      - typings.wordpressComponents.wordpressComponentsStrings.`embed-post`
      - typings.wordpressComponents.wordpressComponentsStrings.`embed-video`
      - typings.wordpressComponents.wordpressComponentsStrings.`excerpt-view`
      - typings.wordpressComponents.wordpressComponentsStrings.exit
      - typings.wordpressComponents.wordpressComponentsStrings.external
      - typings.wordpressComponents.wordpressComponentsStrings.`facebook-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.facebook
      - typings.wordpressComponents.wordpressComponentsStrings.feedback
      - typings.wordpressComponents.wordpressComponentsStrings.filter
      - typings.wordpressComponents.wordpressComponentsStrings.flag
      - typings.wordpressComponents.wordpressComponentsStrings.`format-aside`
      - typings.wordpressComponents.wordpressComponentsStrings.`format-audio`
      - typings.wordpressComponents.wordpressComponentsStrings.`format-chat`
      - typings.wordpressComponents.wordpressComponentsStrings.`format-gallery`
      - typings.wordpressComponents.wordpressComponentsStrings.`format-image`
      - typings.wordpressComponents.wordpressComponentsStrings.`format-quote`
      - typings.wordpressComponents.wordpressComponentsStrings.`format-status`
      - typings.wordpressComponents.wordpressComponentsStrings.`format-video`
      - typings.wordpressComponents.wordpressComponentsStrings.forms
      - typings.wordpressComponents.wordpressComponentsStrings.googleplus
      - typings.wordpressComponents.wordpressComponentsStrings.`grid-view`
      - typings.wordpressComponents.wordpressComponentsStrings.groups
      - typings.wordpressComponents.wordpressComponentsStrings.hammer
      - typings.wordpressComponents.wordpressComponentsStrings.heading
      - typings.wordpressComponents.wordpressComponentsStrings.heart
      - typings.wordpressComponents.wordpressComponentsStrings.hidden
      - typings.wordpressComponents.wordpressComponentsStrings.html
      - typings.wordpressComponents.wordpressComponentsStrings.`id-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.id
      - typings.wordpressComponents.wordpressComponentsStrings.`image-crop`
      - typings.wordpressComponents.wordpressComponentsStrings.`image-filter`
      - typings.wordpressComponents.wordpressComponentsStrings.`image-flip-horizontal`
      - typings.wordpressComponents.wordpressComponentsStrings.`image-flip-vertical`
      - typings.wordpressComponents.wordpressComponentsStrings.`image-rotate-left`
      - typings.wordpressComponents.wordpressComponentsStrings.`image-rotate-right`
      - typings.wordpressComponents.wordpressComponentsStrings.`image-rotate`
      - typings.wordpressComponents.wordpressComponentsStrings.`images-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.`images-alt2`
      - typings.wordpressComponents.wordpressComponentsStrings.`index-card`
      - typings.wordpressComponents.wordpressComponentsStrings.`info-outline`
      - typings.wordpressComponents.wordpressComponentsStrings.info
      - typings.wordpressComponents.wordpressComponentsStrings.`insert-after`
      - typings.wordpressComponents.wordpressComponentsStrings.`insert-before`
      - typings.wordpressComponents.wordpressComponentsStrings.insert
      - typings.wordpressComponents.wordpressComponentsStrings.instagram
      - typings.wordpressComponents.wordpressComponentsStrings.`keyboard-hide`
      - typings.wordpressComponents.wordpressComponentsStrings.laptop
      - typings.wordpressComponents.wordpressComponentsStrings.layout
      - typings.wordpressComponents.wordpressComponentsStrings.leftright
      - typings.wordpressComponents.wordpressComponentsStrings.lightbulb
      - typings.wordpressComponents.wordpressComponentsStrings.`list-view`
      - typings.wordpressComponents.wordpressComponentsStrings.`location-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.location
      - typings.wordpressComponents.wordpressComponentsStrings.lock
      - typings.wordpressComponents.wordpressComponentsStrings.marker
      - typings.wordpressComponents.wordpressComponentsStrings.`media-archive`
      - typings.wordpressComponents.wordpressComponentsStrings.`media-audio`
      - typings.wordpressComponents.wordpressComponentsStrings.`media-code`
      - typings.wordpressComponents.wordpressComponentsStrings.`media-default`
      - typings.wordpressComponents.wordpressComponentsStrings.`media-document`
      - typings.wordpressComponents.wordpressComponentsStrings.`media-interactive`
      - typings.wordpressComponents.wordpressComponentsStrings.`media-spreadsheet`
      - typings.wordpressComponents.wordpressComponentsStrings.`media-text`
      - typings.wordpressComponents.wordpressComponentsStrings.`media-video`
      - typings.wordpressComponents.wordpressComponentsStrings.megaphone
      - typings.wordpressComponents.wordpressComponentsStrings.`menu-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.menu
      - typings.wordpressComponents.wordpressComponentsStrings.microphone
      - typings.wordpressComponents.wordpressComponentsStrings.migrate
      - typings.wordpressComponents.wordpressComponentsStrings.minus
      - typings.wordpressComponents.wordpressComponentsStrings.money
      - typings.wordpressComponents.wordpressComponentsStrings.move
      - typings.wordpressComponents.wordpressComponentsStrings.nametag
      - typings.wordpressComponents.wordpressComponentsStrings.networking
      - typings.wordpressComponents.wordpressComponentsStrings.`no-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.no
      - typings.wordpressComponents.wordpressComponentsStrings.palmtree
      - typings.wordpressComponents.wordpressComponentsStrings.paperclip
      - typings.wordpressComponents.wordpressComponentsStrings.performance
      - typings.wordpressComponents.wordpressComponentsStrings.phone
      - typings.wordpressComponents.wordpressComponentsStrings.`playlist-audio`
      - typings.wordpressComponents.wordpressComponentsStrings.`playlist-video`
      - typings.wordpressComponents.wordpressComponentsStrings.`plus-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.`plus-light`
      - typings.wordpressComponents.wordpressComponentsStrings.plus
      - typings.wordpressComponents.wordpressComponentsStrings.portfolio
      - typings.wordpressComponents.wordpressComponentsStrings.`post-status`
      - typings.wordpressComponents.wordpressComponentsStrings.pressthis
      - typings.wordpressComponents.wordpressComponentsStrings.products
      - typings.wordpressComponents.wordpressComponentsStrings.randomize
      - typings.wordpressComponents.wordpressComponentsStrings.redo
      - typings.wordpressComponents.wordpressComponentsStrings.remove
      - typings.wordpressComponents.wordpressComponentsStrings.`rest-api`
      - typings.wordpressComponents.wordpressComponentsStrings.rss
      - typings.wordpressComponents.wordpressComponentsStrings.saved
      - typings.wordpressComponents.wordpressComponentsStrings.schedule
      - typings.wordpressComponents.wordpressComponentsStrings.screenoptions
      - typings.wordpressComponents.wordpressComponentsStrings.search
      - typings.wordpressComponents.wordpressComponentsStrings.`share-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.`share-alt2`
      - typings.wordpressComponents.wordpressComponentsStrings.share
      - typings.wordpressComponents.wordpressComponentsStrings.`shield-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.shield
      - typings.wordpressComponents.wordpressComponentsStrings.shortcode
      - typings.wordpressComponents.wordpressComponentsStrings.slides
      - typings.wordpressComponents.wordpressComponentsStrings.smartphone
      - typings.wordpressComponents.wordpressComponentsStrings.smiley
      - typings.wordpressComponents.wordpressComponentsStrings.sort
      - typings.wordpressComponents.wordpressComponentsStrings.sos
      - typings.wordpressComponents.wordpressComponentsStrings.`star-empty`
      - typings.wordpressComponents.wordpressComponentsStrings.`star-filled`
      - typings.wordpressComponents.wordpressComponentsStrings.`star-half`
      - typings.wordpressComponents.wordpressComponentsStrings.sticky
      - typings.wordpressComponents.wordpressComponentsStrings.store
      - typings.wordpressComponents.wordpressComponentsStrings.`table-col-after`
      - typings.wordpressComponents.wordpressComponentsStrings.`table-col-before`
      - typings.wordpressComponents.wordpressComponentsStrings.`table-col-delete`
      - typings.wordpressComponents.wordpressComponentsStrings.`table-row-after`
      - typings.wordpressComponents.wordpressComponentsStrings.`table-row-before`
      - typings.wordpressComponents.wordpressComponentsStrings.`table-row-delete`
      - typings.wordpressComponents.wordpressComponentsStrings.tablet
      - typings.wordpressComponents.wordpressComponentsStrings.tag
      - typings.wordpressComponents.wordpressComponentsStrings.tagcloud
      - typings.wordpressComponents.wordpressComponentsStrings.testimonial
      - typings.wordpressComponents.wordpressComponentsStrings.text
      - typings.wordpressComponents.wordpressComponentsStrings.`thumbs-down`
      - typings.wordpressComponents.wordpressComponentsStrings.`thumbs-up`
      - typings.wordpressComponents.wordpressComponentsStrings.`tickets-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.tickets
      - typings.wordpressComponents.wordpressComponentsStrings.tide
      - typings.wordpressComponents.wordpressComponentsStrings.translation
      - typings.wordpressComponents.wordpressComponentsStrings.trash
      - typings.wordpressComponents.wordpressComponentsStrings.twitter
      - typings.wordpressComponents.wordpressComponentsStrings.undo
      - typings.wordpressComponents.wordpressComponentsStrings.`universal-access-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.`universal-access`
      - typings.wordpressComponents.wordpressComponentsStrings.unlock
      - typings.wordpressComponents.wordpressComponentsStrings.update
      - typings.wordpressComponents.wordpressComponentsStrings.upload
      - typings.wordpressComponents.wordpressComponentsStrings.vault
      - typings.wordpressComponents.wordpressComponentsStrings.`video-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.`video-alt2`
      - typings.wordpressComponents.wordpressComponentsStrings.`video-alt3`
      - typings.wordpressComponents.wordpressComponentsStrings.visibility
      - typings.wordpressComponents.wordpressComponentsStrings.warning
      - typings.wordpressComponents.wordpressComponentsStrings.`welcome-add-page`
      - typings.wordpressComponents.wordpressComponentsStrings.`welcome-comments`
      - typings.wordpressComponents.wordpressComponentsStrings.`welcome-learn-more`
      - typings.wordpressComponents.wordpressComponentsStrings.`welcome-view-site`
      - typings.wordpressComponents.wordpressComponentsStrings.`welcome-widgets-menus`
      - typings.wordpressComponents.wordpressComponentsStrings.`welcome-write-blog`
      - typings.wordpressComponents.wordpressComponentsStrings.`wordpress-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.wordpress
      - typings.wordpressComponents.wordpressComponentsStrings.`yes-alt`
      - typings.wordpressComponents.wordpressComponentsStrings.yes
    */
    trait Icon extends StObject
    object Icon {
      
      @scala.inline
      def `admin-appearance`: typings.wordpressComponents.wordpressComponentsStrings.`admin-appearance` = "admin-appearance".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-appearance`]
      
      @scala.inline
      def `admin-collapse`: typings.wordpressComponents.wordpressComponentsStrings.`admin-collapse` = "admin-collapse".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-collapse`]
      
      @scala.inline
      def `admin-comments`: typings.wordpressComponents.wordpressComponentsStrings.`admin-comments` = "admin-comments".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-comments`]
      
      @scala.inline
      def `admin-customizer`: typings.wordpressComponents.wordpressComponentsStrings.`admin-customizer` = "admin-customizer".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-customizer`]
      
      @scala.inline
      def `admin-generic`: typings.wordpressComponents.wordpressComponentsStrings.`admin-generic` = "admin-generic".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-generic`]
      
      @scala.inline
      def `admin-home`: typings.wordpressComponents.wordpressComponentsStrings.`admin-home` = "admin-home".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-home`]
      
      @scala.inline
      def `admin-links`: typings.wordpressComponents.wordpressComponentsStrings.`admin-links` = "admin-links".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-links`]
      
      @scala.inline
      def `admin-media`: typings.wordpressComponents.wordpressComponentsStrings.`admin-media` = "admin-media".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-media`]
      
      @scala.inline
      def `admin-multisite`: typings.wordpressComponents.wordpressComponentsStrings.`admin-multisite` = "admin-multisite".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-multisite`]
      
      @scala.inline
      def `admin-network`: typings.wordpressComponents.wordpressComponentsStrings.`admin-network` = "admin-network".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-network`]
      
      @scala.inline
      def `admin-page`: typings.wordpressComponents.wordpressComponentsStrings.`admin-page` = "admin-page".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-page`]
      
      @scala.inline
      def `admin-plugins`: typings.wordpressComponents.wordpressComponentsStrings.`admin-plugins` = "admin-plugins".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-plugins`]
      
      @scala.inline
      def `admin-post`: typings.wordpressComponents.wordpressComponentsStrings.`admin-post` = "admin-post".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-post`]
      
      @scala.inline
      def `admin-settings`: typings.wordpressComponents.wordpressComponentsStrings.`admin-settings` = "admin-settings".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-settings`]
      
      @scala.inline
      def `admin-site`: typings.wordpressComponents.wordpressComponentsStrings.`admin-site` = "admin-site".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-site`]
      
      @scala.inline
      def `admin-site-alt`: typings.wordpressComponents.wordpressComponentsStrings.`admin-site-alt` = "admin-site-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-site-alt`]
      
      @scala.inline
      def `admin-site-alt2`: typings.wordpressComponents.wordpressComponentsStrings.`admin-site-alt2` = "admin-site-alt2".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-site-alt2`]
      
      @scala.inline
      def `admin-site-alt3`: typings.wordpressComponents.wordpressComponentsStrings.`admin-site-alt3` = "admin-site-alt3".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-site-alt3`]
      
      @scala.inline
      def `admin-tools`: typings.wordpressComponents.wordpressComponentsStrings.`admin-tools` = "admin-tools".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-tools`]
      
      @scala.inline
      def `admin-users`: typings.wordpressComponents.wordpressComponentsStrings.`admin-users` = "admin-users".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`admin-users`]
      
      @scala.inline
      def album: typings.wordpressComponents.wordpressComponentsStrings.album = "album".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.album]
      
      @scala.inline
      def `align-center`: typings.wordpressComponents.wordpressComponentsStrings.`align-center` = "align-center".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`align-center`]
      
      @scala.inline
      def `align-full-width`: typings.wordpressComponents.wordpressComponentsStrings.`align-full-width` = "align-full-width".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`align-full-width`]
      
      @scala.inline
      def `align-left`: typings.wordpressComponents.wordpressComponentsStrings.`align-left` = "align-left".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`align-left`]
      
      @scala.inline
      def `align-none`: typings.wordpressComponents.wordpressComponentsStrings.`align-none` = "align-none".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`align-none`]
      
      @scala.inline
      def `align-pull-left`: typings.wordpressComponents.wordpressComponentsStrings.`align-pull-left` = "align-pull-left".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`align-pull-left`]
      
      @scala.inline
      def `align-pull-right`: typings.wordpressComponents.wordpressComponentsStrings.`align-pull-right` = "align-pull-right".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`align-pull-right`]
      
      @scala.inline
      def `align-right`: typings.wordpressComponents.wordpressComponentsStrings.`align-right` = "align-right".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`align-right`]
      
      @scala.inline
      def `align-wide`: typings.wordpressComponents.wordpressComponentsStrings.`align-wide` = "align-wide".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`align-wide`]
      
      @scala.inline
      def analytics: typings.wordpressComponents.wordpressComponentsStrings.analytics = "analytics".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.analytics]
      
      @scala.inline
      def archive: typings.wordpressComponents.wordpressComponentsStrings.archive = "archive".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.archive]
      
      @scala.inline
      def `arrow-down`: typings.wordpressComponents.wordpressComponentsStrings.`arrow-down` = "arrow-down".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`arrow-down`]
      
      @scala.inline
      def `arrow-down-alt`: typings.wordpressComponents.wordpressComponentsStrings.`arrow-down-alt` = "arrow-down-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`arrow-down-alt`]
      
      @scala.inline
      def `arrow-down-alt2`: typings.wordpressComponents.wordpressComponentsStrings.`arrow-down-alt2` = "arrow-down-alt2".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`arrow-down-alt2`]
      
      @scala.inline
      def `arrow-left`: typings.wordpressComponents.wordpressComponentsStrings.`arrow-left` = "arrow-left".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`arrow-left`]
      
      @scala.inline
      def `arrow-left-alt`: typings.wordpressComponents.wordpressComponentsStrings.`arrow-left-alt` = "arrow-left-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`arrow-left-alt`]
      
      @scala.inline
      def `arrow-left-alt2`: typings.wordpressComponents.wordpressComponentsStrings.`arrow-left-alt2` = "arrow-left-alt2".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`arrow-left-alt2`]
      
      @scala.inline
      def `arrow-right`: typings.wordpressComponents.wordpressComponentsStrings.`arrow-right` = "arrow-right".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`arrow-right`]
      
      @scala.inline
      def `arrow-right-alt`: typings.wordpressComponents.wordpressComponentsStrings.`arrow-right-alt` = "arrow-right-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`arrow-right-alt`]
      
      @scala.inline
      def `arrow-right-alt2`: typings.wordpressComponents.wordpressComponentsStrings.`arrow-right-alt2` = "arrow-right-alt2".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`arrow-right-alt2`]
      
      @scala.inline
      def `arrow-up`: typings.wordpressComponents.wordpressComponentsStrings.`arrow-up` = "arrow-up".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`arrow-up`]
      
      @scala.inline
      def `arrow-up-alt`: typings.wordpressComponents.wordpressComponentsStrings.`arrow-up-alt` = "arrow-up-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`arrow-up-alt`]
      
      @scala.inline
      def `arrow-up-alt2`: typings.wordpressComponents.wordpressComponentsStrings.`arrow-up-alt2` = "arrow-up-alt2".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`arrow-up-alt2`]
      
      @scala.inline
      def art: typings.wordpressComponents.wordpressComponentsStrings.art = "art".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.art]
      
      @scala.inline
      def awards: typings.wordpressComponents.wordpressComponentsStrings.awards = "awards".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.awards]
      
      @scala.inline
      def backup: typings.wordpressComponents.wordpressComponentsStrings.backup = "backup".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.backup]
      
      @scala.inline
      def `block-default`: typings.wordpressComponents.wordpressComponentsStrings.`block-default` = "block-default".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`block-default`]
      
      @scala.inline
      def book: typings.wordpressComponents.wordpressComponentsStrings.book = "book".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.book]
      
      @scala.inline
      def `book-alt`: typings.wordpressComponents.wordpressComponentsStrings.`book-alt` = "book-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`book-alt`]
      
      @scala.inline
      def `buddicons-activity`: typings.wordpressComponents.wordpressComponentsStrings.`buddicons-activity` = "buddicons-activity".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`buddicons-activity`]
      
      @scala.inline
      def `buddicons-bbpress-logo`: typings.wordpressComponents.wordpressComponentsStrings.`buddicons-bbpress-logo` = "buddicons-bbpress-logo".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`buddicons-bbpress-logo`]
      
      @scala.inline
      def `buddicons-buddypress-logo`: typings.wordpressComponents.wordpressComponentsStrings.`buddicons-buddypress-logo` = "buddicons-buddypress-logo".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`buddicons-buddypress-logo`]
      
      @scala.inline
      def `buddicons-community`: typings.wordpressComponents.wordpressComponentsStrings.`buddicons-community` = "buddicons-community".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`buddicons-community`]
      
      @scala.inline
      def `buddicons-forums`: typings.wordpressComponents.wordpressComponentsStrings.`buddicons-forums` = "buddicons-forums".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`buddicons-forums`]
      
      @scala.inline
      def `buddicons-friends`: typings.wordpressComponents.wordpressComponentsStrings.`buddicons-friends` = "buddicons-friends".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`buddicons-friends`]
      
      @scala.inline
      def `buddicons-groups`: typings.wordpressComponents.wordpressComponentsStrings.`buddicons-groups` = "buddicons-groups".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`buddicons-groups`]
      
      @scala.inline
      def `buddicons-pm`: typings.wordpressComponents.wordpressComponentsStrings.`buddicons-pm` = "buddicons-pm".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`buddicons-pm`]
      
      @scala.inline
      def `buddicons-replies`: typings.wordpressComponents.wordpressComponentsStrings.`buddicons-replies` = "buddicons-replies".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`buddicons-replies`]
      
      @scala.inline
      def `buddicons-topics`: typings.wordpressComponents.wordpressComponentsStrings.`buddicons-topics` = "buddicons-topics".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`buddicons-topics`]
      
      @scala.inline
      def `buddicons-tracking`: typings.wordpressComponents.wordpressComponentsStrings.`buddicons-tracking` = "buddicons-tracking".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`buddicons-tracking`]
      
      @scala.inline
      def building: typings.wordpressComponents.wordpressComponentsStrings.building = "building".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.building]
      
      @scala.inline
      def businessman: typings.wordpressComponents.wordpressComponentsStrings.businessman = "businessman".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.businessman]
      
      @scala.inline
      def button: typings.wordpressComponents.wordpressComponentsStrings.button = "button".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.button]
      
      @scala.inline
      def calendar: typings.wordpressComponents.wordpressComponentsStrings.calendar = "calendar".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.calendar]
      
      @scala.inline
      def `calendar-alt`: typings.wordpressComponents.wordpressComponentsStrings.`calendar-alt` = "calendar-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`calendar-alt`]
      
      @scala.inline
      def camera: typings.wordpressComponents.wordpressComponentsStrings.camera = "camera".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.camera]
      
      @scala.inline
      def carrot: typings.wordpressComponents.wordpressComponentsStrings.carrot = "carrot".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.carrot]
      
      @scala.inline
      def cart: typings.wordpressComponents.wordpressComponentsStrings.cart = "cart".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.cart]
      
      @scala.inline
      def category: typings.wordpressComponents.wordpressComponentsStrings.category = "category".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.category]
      
      @scala.inline
      def `chart-area`: typings.wordpressComponents.wordpressComponentsStrings.`chart-area` = "chart-area".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`chart-area`]
      
      @scala.inline
      def `chart-bar`: typings.wordpressComponents.wordpressComponentsStrings.`chart-bar` = "chart-bar".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`chart-bar`]
      
      @scala.inline
      def `chart-line`: typings.wordpressComponents.wordpressComponentsStrings.`chart-line` = "chart-line".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`chart-line`]
      
      @scala.inline
      def `chart-pie`: typings.wordpressComponents.wordpressComponentsStrings.`chart-pie` = "chart-pie".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`chart-pie`]
      
      @scala.inline
      def clipboard: typings.wordpressComponents.wordpressComponentsStrings.clipboard = "clipboard".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.clipboard]
      
      @scala.inline
      def clock: typings.wordpressComponents.wordpressComponentsStrings.clock = "clock".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.clock]
      
      @scala.inline
      def cloud: typings.wordpressComponents.wordpressComponentsStrings.cloud = "cloud".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.cloud]
      
      @scala.inline
      def `cloud-saved`: typings.wordpressComponents.wordpressComponentsStrings.`cloud-saved` = "cloud-saved".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`cloud-saved`]
      
      @scala.inline
      def `cloud-upload`: typings.wordpressComponents.wordpressComponentsStrings.`cloud-upload` = "cloud-upload".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`cloud-upload`]
      
      @scala.inline
      def columns: typings.wordpressComponents.wordpressComponentsStrings.columns = "columns".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.columns]
      
      @scala.inline
      def `controls-back`: typings.wordpressComponents.wordpressComponentsStrings.`controls-back` = "controls-back".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`controls-back`]
      
      @scala.inline
      def `controls-forward`: typings.wordpressComponents.wordpressComponentsStrings.`controls-forward` = "controls-forward".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`controls-forward`]
      
      @scala.inline
      def `controls-pause`: typings.wordpressComponents.wordpressComponentsStrings.`controls-pause` = "controls-pause".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`controls-pause`]
      
      @scala.inline
      def `controls-play`: typings.wordpressComponents.wordpressComponentsStrings.`controls-play` = "controls-play".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`controls-play`]
      
      @scala.inline
      def `controls-repeat`: typings.wordpressComponents.wordpressComponentsStrings.`controls-repeat` = "controls-repeat".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`controls-repeat`]
      
      @scala.inline
      def `controls-skipback`: typings.wordpressComponents.wordpressComponentsStrings.`controls-skipback` = "controls-skipback".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`controls-skipback`]
      
      @scala.inline
      def `controls-skipforward`: typings.wordpressComponents.wordpressComponentsStrings.`controls-skipforward` = "controls-skipforward".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`controls-skipforward`]
      
      @scala.inline
      def `controls-volumeoff`: typings.wordpressComponents.wordpressComponentsStrings.`controls-volumeoff` = "controls-volumeoff".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`controls-volumeoff`]
      
      @scala.inline
      def `controls-volumeon`: typings.wordpressComponents.wordpressComponentsStrings.`controls-volumeon` = "controls-volumeon".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`controls-volumeon`]
      
      @scala.inline
      def `cover-image`: typings.wordpressComponents.wordpressComponentsStrings.`cover-image` = "cover-image".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`cover-image`]
      
      @scala.inline
      def dashboard: typings.wordpressComponents.wordpressComponentsStrings.dashboard = "dashboard".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.dashboard]
      
      @scala.inline
      def desktop: typings.wordpressComponents.wordpressComponentsStrings.desktop = "desktop".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.desktop]
      
      @scala.inline
      def dismiss: typings.wordpressComponents.wordpressComponentsStrings.dismiss = "dismiss".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.dismiss]
      
      @scala.inline
      def download: typings.wordpressComponents.wordpressComponentsStrings.download = "download".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.download]
      
      @scala.inline
      def edit: typings.wordpressComponents.wordpressComponentsStrings.edit = "edit".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.edit]
      
      @scala.inline
      def `editor-aligncenter`: typings.wordpressComponents.wordpressComponentsStrings.`editor-aligncenter` = "editor-aligncenter".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-aligncenter`]
      
      @scala.inline
      def `editor-alignleft`: typings.wordpressComponents.wordpressComponentsStrings.`editor-alignleft` = "editor-alignleft".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-alignleft`]
      
      @scala.inline
      def `editor-alignright`: typings.wordpressComponents.wordpressComponentsStrings.`editor-alignright` = "editor-alignright".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-alignright`]
      
      @scala.inline
      def `editor-bold`: typings.wordpressComponents.wordpressComponentsStrings.`editor-bold` = "editor-bold".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-bold`]
      
      @scala.inline
      def `editor-break`: typings.wordpressComponents.wordpressComponentsStrings.`editor-break` = "editor-break".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-break`]
      
      @scala.inline
      def `editor-code`: typings.wordpressComponents.wordpressComponentsStrings.`editor-code` = "editor-code".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-code`]
      
      @scala.inline
      def `editor-contract`: typings.wordpressComponents.wordpressComponentsStrings.`editor-contract` = "editor-contract".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-contract`]
      
      @scala.inline
      def `editor-customchar`: typings.wordpressComponents.wordpressComponentsStrings.`editor-customchar` = "editor-customchar".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-customchar`]
      
      @scala.inline
      def `editor-expand`: typings.wordpressComponents.wordpressComponentsStrings.`editor-expand` = "editor-expand".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-expand`]
      
      @scala.inline
      def `editor-help`: typings.wordpressComponents.wordpressComponentsStrings.`editor-help` = "editor-help".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-help`]
      
      @scala.inline
      def `editor-indent`: typings.wordpressComponents.wordpressComponentsStrings.`editor-indent` = "editor-indent".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-indent`]
      
      @scala.inline
      def `editor-insertmore`: typings.wordpressComponents.wordpressComponentsStrings.`editor-insertmore` = "editor-insertmore".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-insertmore`]
      
      @scala.inline
      def `editor-italic`: typings.wordpressComponents.wordpressComponentsStrings.`editor-italic` = "editor-italic".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-italic`]
      
      @scala.inline
      def `editor-justify`: typings.wordpressComponents.wordpressComponentsStrings.`editor-justify` = "editor-justify".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-justify`]
      
      @scala.inline
      def `editor-kitchensink`: typings.wordpressComponents.wordpressComponentsStrings.`editor-kitchensink` = "editor-kitchensink".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-kitchensink`]
      
      @scala.inline
      def `editor-ltr`: typings.wordpressComponents.wordpressComponentsStrings.`editor-ltr` = "editor-ltr".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-ltr`]
      
      @scala.inline
      def `editor-ol`: typings.wordpressComponents.wordpressComponentsStrings.`editor-ol` = "editor-ol".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-ol`]
      
      @scala.inline
      def `editor-ol-rtl`: typings.wordpressComponents.wordpressComponentsStrings.`editor-ol-rtl` = "editor-ol-rtl".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-ol-rtl`]
      
      @scala.inline
      def `editor-outdent`: typings.wordpressComponents.wordpressComponentsStrings.`editor-outdent` = "editor-outdent".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-outdent`]
      
      @scala.inline
      def `editor-paragraph`: typings.wordpressComponents.wordpressComponentsStrings.`editor-paragraph` = "editor-paragraph".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-paragraph`]
      
      @scala.inline
      def `editor-paste-text`: typings.wordpressComponents.wordpressComponentsStrings.`editor-paste-text` = "editor-paste-text".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-paste-text`]
      
      @scala.inline
      def `editor-paste-word`: typings.wordpressComponents.wordpressComponentsStrings.`editor-paste-word` = "editor-paste-word".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-paste-word`]
      
      @scala.inline
      def `editor-quote`: typings.wordpressComponents.wordpressComponentsStrings.`editor-quote` = "editor-quote".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-quote`]
      
      @scala.inline
      def `editor-removeformatting`: typings.wordpressComponents.wordpressComponentsStrings.`editor-removeformatting` = "editor-removeformatting".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-removeformatting`]
      
      @scala.inline
      def `editor-rtl`: typings.wordpressComponents.wordpressComponentsStrings.`editor-rtl` = "editor-rtl".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-rtl`]
      
      @scala.inline
      def `editor-spellcheck`: typings.wordpressComponents.wordpressComponentsStrings.`editor-spellcheck` = "editor-spellcheck".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-spellcheck`]
      
      @scala.inline
      def `editor-strikethrough`: typings.wordpressComponents.wordpressComponentsStrings.`editor-strikethrough` = "editor-strikethrough".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-strikethrough`]
      
      @scala.inline
      def `editor-table`: typings.wordpressComponents.wordpressComponentsStrings.`editor-table` = "editor-table".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-table`]
      
      @scala.inline
      def `editor-textcolor`: typings.wordpressComponents.wordpressComponentsStrings.`editor-textcolor` = "editor-textcolor".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-textcolor`]
      
      @scala.inline
      def `editor-ul`: typings.wordpressComponents.wordpressComponentsStrings.`editor-ul` = "editor-ul".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-ul`]
      
      @scala.inline
      def `editor-underline`: typings.wordpressComponents.wordpressComponentsStrings.`editor-underline` = "editor-underline".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-underline`]
      
      @scala.inline
      def `editor-unlink`: typings.wordpressComponents.wordpressComponentsStrings.`editor-unlink` = "editor-unlink".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-unlink`]
      
      @scala.inline
      def `editor-video`: typings.wordpressComponents.wordpressComponentsStrings.`editor-video` = "editor-video".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`editor-video`]
      
      @scala.inline
      def ellipsis: typings.wordpressComponents.wordpressComponentsStrings.ellipsis = "ellipsis".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.ellipsis]
      
      @scala.inline
      def email: typings.wordpressComponents.wordpressComponentsStrings.email = "email".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.email]
      
      @scala.inline
      def `email-alt`: typings.wordpressComponents.wordpressComponentsStrings.`email-alt` = "email-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`email-alt`]
      
      @scala.inline
      def `email-alt2`: typings.wordpressComponents.wordpressComponentsStrings.`email-alt2` = "email-alt2".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`email-alt2`]
      
      @scala.inline
      def `embed-audio`: typings.wordpressComponents.wordpressComponentsStrings.`embed-audio` = "embed-audio".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`embed-audio`]
      
      @scala.inline
      def `embed-generic`: typings.wordpressComponents.wordpressComponentsStrings.`embed-generic` = "embed-generic".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`embed-generic`]
      
      @scala.inline
      def `embed-photo`: typings.wordpressComponents.wordpressComponentsStrings.`embed-photo` = "embed-photo".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`embed-photo`]
      
      @scala.inline
      def `embed-post`: typings.wordpressComponents.wordpressComponentsStrings.`embed-post` = "embed-post".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`embed-post`]
      
      @scala.inline
      def `embed-video`: typings.wordpressComponents.wordpressComponentsStrings.`embed-video` = "embed-video".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`embed-video`]
      
      @scala.inline
      def `excerpt-view`: typings.wordpressComponents.wordpressComponentsStrings.`excerpt-view` = "excerpt-view".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`excerpt-view`]
      
      @scala.inline
      def exit: typings.wordpressComponents.wordpressComponentsStrings.exit = "exit".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.exit]
      
      @scala.inline
      def external: typings.wordpressComponents.wordpressComponentsStrings.external = "external".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.external]
      
      @scala.inline
      def facebook: typings.wordpressComponents.wordpressComponentsStrings.facebook = "facebook".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.facebook]
      
      @scala.inline
      def `facebook-alt`: typings.wordpressComponents.wordpressComponentsStrings.`facebook-alt` = "facebook-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`facebook-alt`]
      
      @scala.inline
      def feedback: typings.wordpressComponents.wordpressComponentsStrings.feedback = "feedback".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.feedback]
      
      @scala.inline
      def filter: typings.wordpressComponents.wordpressComponentsStrings.filter = "filter".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.filter]
      
      @scala.inline
      def flag: typings.wordpressComponents.wordpressComponentsStrings.flag = "flag".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.flag]
      
      @scala.inline
      def `format-aside`: typings.wordpressComponents.wordpressComponentsStrings.`format-aside` = "format-aside".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`format-aside`]
      
      @scala.inline
      def `format-audio`: typings.wordpressComponents.wordpressComponentsStrings.`format-audio` = "format-audio".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`format-audio`]
      
      @scala.inline
      def `format-chat`: typings.wordpressComponents.wordpressComponentsStrings.`format-chat` = "format-chat".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`format-chat`]
      
      @scala.inline
      def `format-gallery`: typings.wordpressComponents.wordpressComponentsStrings.`format-gallery` = "format-gallery".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`format-gallery`]
      
      @scala.inline
      def `format-image`: typings.wordpressComponents.wordpressComponentsStrings.`format-image` = "format-image".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`format-image`]
      
      @scala.inline
      def `format-quote`: typings.wordpressComponents.wordpressComponentsStrings.`format-quote` = "format-quote".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`format-quote`]
      
      @scala.inline
      def `format-status`: typings.wordpressComponents.wordpressComponentsStrings.`format-status` = "format-status".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`format-status`]
      
      @scala.inline
      def `format-video`: typings.wordpressComponents.wordpressComponentsStrings.`format-video` = "format-video".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`format-video`]
      
      @scala.inline
      def forms: typings.wordpressComponents.wordpressComponentsStrings.forms = "forms".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.forms]
      
      @scala.inline
      def googleplus: typings.wordpressComponents.wordpressComponentsStrings.googleplus = "googleplus".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.googleplus]
      
      @scala.inline
      def `grid-view`: typings.wordpressComponents.wordpressComponentsStrings.`grid-view` = "grid-view".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`grid-view`]
      
      @scala.inline
      def groups: typings.wordpressComponents.wordpressComponentsStrings.groups = "groups".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.groups]
      
      @scala.inline
      def hammer: typings.wordpressComponents.wordpressComponentsStrings.hammer = "hammer".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.hammer]
      
      @scala.inline
      def heading: typings.wordpressComponents.wordpressComponentsStrings.heading = "heading".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.heading]
      
      @scala.inline
      def heart: typings.wordpressComponents.wordpressComponentsStrings.heart = "heart".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.heart]
      
      @scala.inline
      def hidden: typings.wordpressComponents.wordpressComponentsStrings.hidden = "hidden".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.hidden]
      
      @scala.inline
      def html: typings.wordpressComponents.wordpressComponentsStrings.html = "html".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.html]
      
      @scala.inline
      def id: typings.wordpressComponents.wordpressComponentsStrings.id = "id".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.id]
      
      @scala.inline
      def `id-alt`: typings.wordpressComponents.wordpressComponentsStrings.`id-alt` = "id-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`id-alt`]
      
      @scala.inline
      def `image-crop`: typings.wordpressComponents.wordpressComponentsStrings.`image-crop` = "image-crop".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`image-crop`]
      
      @scala.inline
      def `image-filter`: typings.wordpressComponents.wordpressComponentsStrings.`image-filter` = "image-filter".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`image-filter`]
      
      @scala.inline
      def `image-flip-horizontal`: typings.wordpressComponents.wordpressComponentsStrings.`image-flip-horizontal` = "image-flip-horizontal".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`image-flip-horizontal`]
      
      @scala.inline
      def `image-flip-vertical`: typings.wordpressComponents.wordpressComponentsStrings.`image-flip-vertical` = "image-flip-vertical".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`image-flip-vertical`]
      
      @scala.inline
      def `image-rotate`: typings.wordpressComponents.wordpressComponentsStrings.`image-rotate` = "image-rotate".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`image-rotate`]
      
      @scala.inline
      def `image-rotate-left`: typings.wordpressComponents.wordpressComponentsStrings.`image-rotate-left` = "image-rotate-left".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`image-rotate-left`]
      
      @scala.inline
      def `image-rotate-right`: typings.wordpressComponents.wordpressComponentsStrings.`image-rotate-right` = "image-rotate-right".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`image-rotate-right`]
      
      @scala.inline
      def `images-alt`: typings.wordpressComponents.wordpressComponentsStrings.`images-alt` = "images-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`images-alt`]
      
      @scala.inline
      def `images-alt2`: typings.wordpressComponents.wordpressComponentsStrings.`images-alt2` = "images-alt2".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`images-alt2`]
      
      @scala.inline
      def `index-card`: typings.wordpressComponents.wordpressComponentsStrings.`index-card` = "index-card".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`index-card`]
      
      @scala.inline
      def info: typings.wordpressComponents.wordpressComponentsStrings.info = "info".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.info]
      
      @scala.inline
      def `info-outline`: typings.wordpressComponents.wordpressComponentsStrings.`info-outline` = "info-outline".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`info-outline`]
      
      @scala.inline
      def insert: typings.wordpressComponents.wordpressComponentsStrings.insert = "insert".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.insert]
      
      @scala.inline
      def `insert-after`: typings.wordpressComponents.wordpressComponentsStrings.`insert-after` = "insert-after".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`insert-after`]
      
      @scala.inline
      def `insert-before`: typings.wordpressComponents.wordpressComponentsStrings.`insert-before` = "insert-before".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`insert-before`]
      
      @scala.inline
      def instagram: typings.wordpressComponents.wordpressComponentsStrings.instagram = "instagram".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.instagram]
      
      @scala.inline
      def `keyboard-hide`: typings.wordpressComponents.wordpressComponentsStrings.`keyboard-hide` = "keyboard-hide".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`keyboard-hide`]
      
      @scala.inline
      def laptop: typings.wordpressComponents.wordpressComponentsStrings.laptop = "laptop".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.laptop]
      
      @scala.inline
      def layout: typings.wordpressComponents.wordpressComponentsStrings.layout = "layout".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.layout]
      
      @scala.inline
      def leftright: typings.wordpressComponents.wordpressComponentsStrings.leftright = "leftright".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.leftright]
      
      @scala.inline
      def lightbulb: typings.wordpressComponents.wordpressComponentsStrings.lightbulb = "lightbulb".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.lightbulb]
      
      @scala.inline
      def `list-view`: typings.wordpressComponents.wordpressComponentsStrings.`list-view` = "list-view".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`list-view`]
      
      @scala.inline
      def location: typings.wordpressComponents.wordpressComponentsStrings.location = "location".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.location]
      
      @scala.inline
      def `location-alt`: typings.wordpressComponents.wordpressComponentsStrings.`location-alt` = "location-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`location-alt`]
      
      @scala.inline
      def lock: typings.wordpressComponents.wordpressComponentsStrings.lock = "lock".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.lock]
      
      @scala.inline
      def marker: typings.wordpressComponents.wordpressComponentsStrings.marker = "marker".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.marker]
      
      @scala.inline
      def `media-archive`: typings.wordpressComponents.wordpressComponentsStrings.`media-archive` = "media-archive".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`media-archive`]
      
      @scala.inline
      def `media-audio`: typings.wordpressComponents.wordpressComponentsStrings.`media-audio` = "media-audio".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`media-audio`]
      
      @scala.inline
      def `media-code`: typings.wordpressComponents.wordpressComponentsStrings.`media-code` = "media-code".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`media-code`]
      
      @scala.inline
      def `media-default`: typings.wordpressComponents.wordpressComponentsStrings.`media-default` = "media-default".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`media-default`]
      
      @scala.inline
      def `media-document`: typings.wordpressComponents.wordpressComponentsStrings.`media-document` = "media-document".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`media-document`]
      
      @scala.inline
      def `media-interactive`: typings.wordpressComponents.wordpressComponentsStrings.`media-interactive` = "media-interactive".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`media-interactive`]
      
      @scala.inline
      def `media-spreadsheet`: typings.wordpressComponents.wordpressComponentsStrings.`media-spreadsheet` = "media-spreadsheet".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`media-spreadsheet`]
      
      @scala.inline
      def `media-text`: typings.wordpressComponents.wordpressComponentsStrings.`media-text` = "media-text".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`media-text`]
      
      @scala.inline
      def `media-video`: typings.wordpressComponents.wordpressComponentsStrings.`media-video` = "media-video".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`media-video`]
      
      @scala.inline
      def megaphone: typings.wordpressComponents.wordpressComponentsStrings.megaphone = "megaphone".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.megaphone]
      
      @scala.inline
      def menu: typings.wordpressComponents.wordpressComponentsStrings.menu = "menu".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.menu]
      
      @scala.inline
      def `menu-alt`: typings.wordpressComponents.wordpressComponentsStrings.`menu-alt` = "menu-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`menu-alt`]
      
      @scala.inline
      def microphone: typings.wordpressComponents.wordpressComponentsStrings.microphone = "microphone".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.microphone]
      
      @scala.inline
      def migrate: typings.wordpressComponents.wordpressComponentsStrings.migrate = "migrate".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.migrate]
      
      @scala.inline
      def minus: typings.wordpressComponents.wordpressComponentsStrings.minus = "minus".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.minus]
      
      @scala.inline
      def money: typings.wordpressComponents.wordpressComponentsStrings.money = "money".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.money]
      
      @scala.inline
      def move: typings.wordpressComponents.wordpressComponentsStrings.move = "move".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.move]
      
      @scala.inline
      def nametag: typings.wordpressComponents.wordpressComponentsStrings.nametag = "nametag".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.nametag]
      
      @scala.inline
      def networking: typings.wordpressComponents.wordpressComponentsStrings.networking = "networking".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.networking]
      
      @scala.inline
      def no: typings.wordpressComponents.wordpressComponentsStrings.no = "no".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.no]
      
      @scala.inline
      def `no-alt`: typings.wordpressComponents.wordpressComponentsStrings.`no-alt` = "no-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`no-alt`]
      
      @scala.inline
      def palmtree: typings.wordpressComponents.wordpressComponentsStrings.palmtree = "palmtree".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.palmtree]
      
      @scala.inline
      def paperclip: typings.wordpressComponents.wordpressComponentsStrings.paperclip = "paperclip".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.paperclip]
      
      @scala.inline
      def performance: typings.wordpressComponents.wordpressComponentsStrings.performance = "performance".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.performance]
      
      @scala.inline
      def phone: typings.wordpressComponents.wordpressComponentsStrings.phone = "phone".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.phone]
      
      @scala.inline
      def `playlist-audio`: typings.wordpressComponents.wordpressComponentsStrings.`playlist-audio` = "playlist-audio".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`playlist-audio`]
      
      @scala.inline
      def `playlist-video`: typings.wordpressComponents.wordpressComponentsStrings.`playlist-video` = "playlist-video".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`playlist-video`]
      
      @scala.inline
      def plus: typings.wordpressComponents.wordpressComponentsStrings.plus = "plus".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.plus]
      
      @scala.inline
      def `plus-alt`: typings.wordpressComponents.wordpressComponentsStrings.`plus-alt` = "plus-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`plus-alt`]
      
      @scala.inline
      def `plus-light`: typings.wordpressComponents.wordpressComponentsStrings.`plus-light` = "plus-light".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`plus-light`]
      
      @scala.inline
      def portfolio: typings.wordpressComponents.wordpressComponentsStrings.portfolio = "portfolio".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.portfolio]
      
      @scala.inline
      def `post-status`: typings.wordpressComponents.wordpressComponentsStrings.`post-status` = "post-status".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`post-status`]
      
      @scala.inline
      def pressthis: typings.wordpressComponents.wordpressComponentsStrings.pressthis = "pressthis".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.pressthis]
      
      @scala.inline
      def products: typings.wordpressComponents.wordpressComponentsStrings.products = "products".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.products]
      
      @scala.inline
      def randomize: typings.wordpressComponents.wordpressComponentsStrings.randomize = "randomize".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.randomize]
      
      @scala.inline
      def redo: typings.wordpressComponents.wordpressComponentsStrings.redo = "redo".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.redo]
      
      @scala.inline
      def remove: typings.wordpressComponents.wordpressComponentsStrings.remove = "remove".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.remove]
      
      @scala.inline
      def `rest-api`: typings.wordpressComponents.wordpressComponentsStrings.`rest-api` = "rest-api".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`rest-api`]
      
      @scala.inline
      def rss: typings.wordpressComponents.wordpressComponentsStrings.rss = "rss".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.rss]
      
      @scala.inline
      def saved: typings.wordpressComponents.wordpressComponentsStrings.saved = "saved".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.saved]
      
      @scala.inline
      def schedule: typings.wordpressComponents.wordpressComponentsStrings.schedule = "schedule".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.schedule]
      
      @scala.inline
      def screenoptions: typings.wordpressComponents.wordpressComponentsStrings.screenoptions = "screenoptions".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.screenoptions]
      
      @scala.inline
      def search: typings.wordpressComponents.wordpressComponentsStrings.search = "search".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.search]
      
      @scala.inline
      def share: typings.wordpressComponents.wordpressComponentsStrings.share = "share".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.share]
      
      @scala.inline
      def `share-alt`: typings.wordpressComponents.wordpressComponentsStrings.`share-alt` = "share-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`share-alt`]
      
      @scala.inline
      def `share-alt2`: typings.wordpressComponents.wordpressComponentsStrings.`share-alt2` = "share-alt2".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`share-alt2`]
      
      @scala.inline
      def shield: typings.wordpressComponents.wordpressComponentsStrings.shield = "shield".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.shield]
      
      @scala.inline
      def `shield-alt`: typings.wordpressComponents.wordpressComponentsStrings.`shield-alt` = "shield-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`shield-alt`]
      
      @scala.inline
      def shortcode: typings.wordpressComponents.wordpressComponentsStrings.shortcode = "shortcode".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.shortcode]
      
      @scala.inline
      def slides: typings.wordpressComponents.wordpressComponentsStrings.slides = "slides".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.slides]
      
      @scala.inline
      def smartphone: typings.wordpressComponents.wordpressComponentsStrings.smartphone = "smartphone".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.smartphone]
      
      @scala.inline
      def smiley: typings.wordpressComponents.wordpressComponentsStrings.smiley = "smiley".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.smiley]
      
      @scala.inline
      def sort: typings.wordpressComponents.wordpressComponentsStrings.sort = "sort".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.sort]
      
      @scala.inline
      def sos: typings.wordpressComponents.wordpressComponentsStrings.sos = "sos".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.sos]
      
      @scala.inline
      def `star-empty`: typings.wordpressComponents.wordpressComponentsStrings.`star-empty` = "star-empty".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`star-empty`]
      
      @scala.inline
      def `star-filled`: typings.wordpressComponents.wordpressComponentsStrings.`star-filled` = "star-filled".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`star-filled`]
      
      @scala.inline
      def `star-half`: typings.wordpressComponents.wordpressComponentsStrings.`star-half` = "star-half".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`star-half`]
      
      @scala.inline
      def sticky: typings.wordpressComponents.wordpressComponentsStrings.sticky = "sticky".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.sticky]
      
      @scala.inline
      def store: typings.wordpressComponents.wordpressComponentsStrings.store = "store".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.store]
      
      @scala.inline
      def `table-col-after`: typings.wordpressComponents.wordpressComponentsStrings.`table-col-after` = "table-col-after".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`table-col-after`]
      
      @scala.inline
      def `table-col-before`: typings.wordpressComponents.wordpressComponentsStrings.`table-col-before` = "table-col-before".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`table-col-before`]
      
      @scala.inline
      def `table-col-delete`: typings.wordpressComponents.wordpressComponentsStrings.`table-col-delete` = "table-col-delete".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`table-col-delete`]
      
      @scala.inline
      def `table-row-after`: typings.wordpressComponents.wordpressComponentsStrings.`table-row-after` = "table-row-after".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`table-row-after`]
      
      @scala.inline
      def `table-row-before`: typings.wordpressComponents.wordpressComponentsStrings.`table-row-before` = "table-row-before".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`table-row-before`]
      
      @scala.inline
      def `table-row-delete`: typings.wordpressComponents.wordpressComponentsStrings.`table-row-delete` = "table-row-delete".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`table-row-delete`]
      
      @scala.inline
      def tablet: typings.wordpressComponents.wordpressComponentsStrings.tablet = "tablet".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.tablet]
      
      @scala.inline
      def tag: typings.wordpressComponents.wordpressComponentsStrings.tag = "tag".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.tag]
      
      @scala.inline
      def tagcloud: typings.wordpressComponents.wordpressComponentsStrings.tagcloud = "tagcloud".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.tagcloud]
      
      @scala.inline
      def testimonial: typings.wordpressComponents.wordpressComponentsStrings.testimonial = "testimonial".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.testimonial]
      
      @scala.inline
      def text: typings.wordpressComponents.wordpressComponentsStrings.text = "text".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.text]
      
      @scala.inline
      def `thumbs-down`: typings.wordpressComponents.wordpressComponentsStrings.`thumbs-down` = "thumbs-down".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`thumbs-down`]
      
      @scala.inline
      def `thumbs-up`: typings.wordpressComponents.wordpressComponentsStrings.`thumbs-up` = "thumbs-up".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`thumbs-up`]
      
      @scala.inline
      def tickets: typings.wordpressComponents.wordpressComponentsStrings.tickets = "tickets".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.tickets]
      
      @scala.inline
      def `tickets-alt`: typings.wordpressComponents.wordpressComponentsStrings.`tickets-alt` = "tickets-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`tickets-alt`]
      
      @scala.inline
      def tide: typings.wordpressComponents.wordpressComponentsStrings.tide = "tide".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.tide]
      
      @scala.inline
      def translation: typings.wordpressComponents.wordpressComponentsStrings.translation = "translation".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.translation]
      
      @scala.inline
      def trash: typings.wordpressComponents.wordpressComponentsStrings.trash = "trash".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.trash]
      
      @scala.inline
      def twitter: typings.wordpressComponents.wordpressComponentsStrings.twitter = "twitter".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.twitter]
      
      @scala.inline
      def undo: typings.wordpressComponents.wordpressComponentsStrings.undo = "undo".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.undo]
      
      @scala.inline
      def `universal-access`: typings.wordpressComponents.wordpressComponentsStrings.`universal-access` = "universal-access".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`universal-access`]
      
      @scala.inline
      def `universal-access-alt`: typings.wordpressComponents.wordpressComponentsStrings.`universal-access-alt` = "universal-access-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`universal-access-alt`]
      
      @scala.inline
      def unlock: typings.wordpressComponents.wordpressComponentsStrings.unlock = "unlock".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.unlock]
      
      @scala.inline
      def update: typings.wordpressComponents.wordpressComponentsStrings.update = "update".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.update]
      
      @scala.inline
      def upload: typings.wordpressComponents.wordpressComponentsStrings.upload = "upload".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.upload]
      
      @scala.inline
      def vault: typings.wordpressComponents.wordpressComponentsStrings.vault = "vault".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.vault]
      
      @scala.inline
      def `video-alt`: typings.wordpressComponents.wordpressComponentsStrings.`video-alt` = "video-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`video-alt`]
      
      @scala.inline
      def `video-alt2`: typings.wordpressComponents.wordpressComponentsStrings.`video-alt2` = "video-alt2".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`video-alt2`]
      
      @scala.inline
      def `video-alt3`: typings.wordpressComponents.wordpressComponentsStrings.`video-alt3` = "video-alt3".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`video-alt3`]
      
      @scala.inline
      def visibility: typings.wordpressComponents.wordpressComponentsStrings.visibility = "visibility".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.visibility]
      
      @scala.inline
      def warning: typings.wordpressComponents.wordpressComponentsStrings.warning = "warning".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.warning]
      
      @scala.inline
      def `welcome-add-page`: typings.wordpressComponents.wordpressComponentsStrings.`welcome-add-page` = "welcome-add-page".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`welcome-add-page`]
      
      @scala.inline
      def `welcome-comments`: typings.wordpressComponents.wordpressComponentsStrings.`welcome-comments` = "welcome-comments".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`welcome-comments`]
      
      @scala.inline
      def `welcome-learn-more`: typings.wordpressComponents.wordpressComponentsStrings.`welcome-learn-more` = "welcome-learn-more".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`welcome-learn-more`]
      
      @scala.inline
      def `welcome-view-site`: typings.wordpressComponents.wordpressComponentsStrings.`welcome-view-site` = "welcome-view-site".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`welcome-view-site`]
      
      @scala.inline
      def `welcome-widgets-menus`: typings.wordpressComponents.wordpressComponentsStrings.`welcome-widgets-menus` = "welcome-widgets-menus".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`welcome-widgets-menus`]
      
      @scala.inline
      def `welcome-write-blog`: typings.wordpressComponents.wordpressComponentsStrings.`welcome-write-blog` = "welcome-write-blog".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`welcome-write-blog`]
      
      @scala.inline
      def wordpress: typings.wordpressComponents.wordpressComponentsStrings.wordpress = "wordpress".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.wordpress]
      
      @scala.inline
      def `wordpress-alt`: typings.wordpressComponents.wordpressComponentsStrings.`wordpress-alt` = "wordpress-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`wordpress-alt`]
      
      @scala.inline
      def yes: typings.wordpressComponents.wordpressComponentsStrings.yes = "yes".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.yes]
      
      @scala.inline
      def `yes-alt`: typings.wordpressComponents.wordpressComponentsStrings.`yes-alt` = "yes-alt".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`yes-alt`]
    }
    
    @js.native
    trait Props extends SVGProps[SVGSVGElement] {
      
      /**
        * ID of the dashicon to use.
        */
      var icon: Icon = js.native
      
      /**
        * Width of the icon (in pixels).
        * @defaultValue 20
        */
      var size: js.UndefOr[Double] = js.native
    }
    object Props {
      
      @scala.inline
      def apply(icon: Icon): Props = {
        val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      }
    }
  }
}
