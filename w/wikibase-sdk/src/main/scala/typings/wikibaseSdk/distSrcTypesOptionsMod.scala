package typings.wikibaseSdk

import typings.std.Record
import typings.wikibaseSdk.distSrcTypesSimplifyClaimsMod.SimplifySnaksOptions
import typings.wikibaseSdk.wikibaseSdkBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOptionsMod {
  
  type ApiQueryParameters = Record[String, String | Double | `true`]
  
  trait InstanceConfig extends StObject {
    
    var instance: js.UndefOr[String] = js.undefined
    
    var sparqlEndpoint: js.UndefOr[String] = js.undefined
    
    var wgScriptPath: js.UndefOr[String] = js.undefined
  }
  object InstanceConfig {
    
    inline def apply(): InstanceConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstanceConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstanceConfig] (val x: Self) extends AnyVal {
      
      inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
      
      inline def setSparqlEndpoint(value: String): Self = StObject.set(x, "sparqlEndpoint", value.asInstanceOf[js.Any])
      
      inline def setSparqlEndpointUndefined: Self = StObject.set(x, "sparqlEndpoint", js.undefined)
      
      inline def setWgScriptPath(value: String): Self = StObject.set(x, "wgScriptPath", value.asInstanceOf[js.Any])
      
      inline def setWgScriptPathUndefined: Self = StObject.set(x, "wgScriptPath", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wikibaseSdk.wikibaseSdkStrings.info
    - typings.wikibaseSdk.wikibaseSdkStrings.sitelinks
    - typings.wikibaseSdk.wikibaseSdkStrings.sitelinksSlashurls
    - typings.wikibaseSdk.wikibaseSdkStrings.aliases
    - typings.wikibaseSdk.wikibaseSdkStrings.labels
    - typings.wikibaseSdk.wikibaseSdkStrings.descriptions
    - typings.wikibaseSdk.wikibaseSdkStrings.claims
    - typings.wikibaseSdk.wikibaseSdkStrings.datatype
  */
  trait Props extends StObject
  object Props {
    
    inline def aliases: typings.wikibaseSdk.wikibaseSdkStrings.aliases = "aliases".asInstanceOf[typings.wikibaseSdk.wikibaseSdkStrings.aliases]
    
    inline def claims: typings.wikibaseSdk.wikibaseSdkStrings.claims = "claims".asInstanceOf[typings.wikibaseSdk.wikibaseSdkStrings.claims]
    
    inline def datatype: typings.wikibaseSdk.wikibaseSdkStrings.datatype = "datatype".asInstanceOf[typings.wikibaseSdk.wikibaseSdkStrings.datatype]
    
    inline def descriptions: typings.wikibaseSdk.wikibaseSdkStrings.descriptions = "descriptions".asInstanceOf[typings.wikibaseSdk.wikibaseSdkStrings.descriptions]
    
    inline def info: typings.wikibaseSdk.wikibaseSdkStrings.info = "info".asInstanceOf[typings.wikibaseSdk.wikibaseSdkStrings.info]
    
    inline def labels: typings.wikibaseSdk.wikibaseSdkStrings.labels = "labels".asInstanceOf[typings.wikibaseSdk.wikibaseSdkStrings.labels]
    
    inline def sitelinks: typings.wikibaseSdk.wikibaseSdkStrings.sitelinks = "sitelinks".asInstanceOf[typings.wikibaseSdk.wikibaseSdkStrings.sitelinks]
    
    inline def sitelinksSlashurls: typings.wikibaseSdk.wikibaseSdkStrings.sitelinksSlashurls = "sitelinks/urls".asInstanceOf[typings.wikibaseSdk.wikibaseSdkStrings.sitelinksSlashurls]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.wikibaseSdk.distSrcTypesOptionsMod.SimplifySitelinkOptions because var conflicts: keepAll. Inlined addUrl, keepBadges */ trait SimplifyEntityOptions
    extends StObject
       with SimplifySnaksOptions {
    
    var addUrl: js.UndefOr[Boolean] = js.undefined
    
    var keepBadges: js.UndefOr[Boolean] = js.undefined
  }
  object SimplifyEntityOptions {
    
    inline def apply(): SimplifyEntityOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimplifyEntityOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimplifyEntityOptions] (val x: Self) extends AnyVal {
      
      inline def setAddUrl(value: Boolean): Self = StObject.set(x, "addUrl", value.asInstanceOf[js.Any])
      
      inline def setAddUrlUndefined: Self = StObject.set(x, "addUrl", js.undefined)
      
      inline def setKeepBadges(value: Boolean): Self = StObject.set(x, "keepBadges", value.asInstanceOf[js.Any])
      
      inline def setKeepBadgesUndefined: Self = StObject.set(x, "keepBadges", js.undefined)
    }
  }
  
  trait SimplifySitelinkOptions extends StObject {
    
    var addUrl: js.UndefOr[Boolean] = js.undefined
    
    var keepAll: js.UndefOr[Boolean] = js.undefined
    
    var keepBadges: js.UndefOr[Boolean] = js.undefined
  }
  object SimplifySitelinkOptions {
    
    inline def apply(): SimplifySitelinkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimplifySitelinkOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimplifySitelinkOptions] (val x: Self) extends AnyVal {
      
      inline def setAddUrl(value: Boolean): Self = StObject.set(x, "addUrl", value.asInstanceOf[js.Any])
      
      inline def setAddUrlUndefined: Self = StObject.set(x, "addUrl", js.undefined)
      
      inline def setKeepAll(value: Boolean): Self = StObject.set(x, "keepAll", value.asInstanceOf[js.Any])
      
      inline def setKeepAllUndefined: Self = StObject.set(x, "keepAll", js.undefined)
      
      inline def setKeepBadges(value: Boolean): Self = StObject.set(x, "keepBadges", value.asInstanceOf[js.Any])
      
      inline def setKeepBadgesUndefined: Self = StObject.set(x, "keepBadges", js.undefined)
    }
  }
  
  type Url = String
  
  /* Rewritten from type alias, can be one of: 
    - typings.wikibaseSdk.wikibaseSdkStrings.xml
    - typings.wikibaseSdk.wikibaseSdkStrings.json
  */
  trait UrlResultFormat extends StObject
  object UrlResultFormat {
    
    inline def json: typings.wikibaseSdk.wikibaseSdkStrings.json = "json".asInstanceOf[typings.wikibaseSdk.wikibaseSdkStrings.json]
    
    inline def xml: typings.wikibaseSdk.wikibaseSdkStrings.xml = "xml".asInstanceOf[typings.wikibaseSdk.wikibaseSdkStrings.xml]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wikibaseSdk.wikibaseSdkStrings.aa
    - typings.wikibaseSdk.wikibaseSdkStrings.ab
    - typings.wikibaseSdk.wikibaseSdkStrings.ace
    - typings.wikibaseSdk.wikibaseSdkStrings.ady
    - typings.wikibaseSdk.wikibaseSdkStrings.af
    - typings.wikibaseSdk.wikibaseSdkStrings.ak
    - typings.wikibaseSdk.wikibaseSdkStrings.als
    - typings.wikibaseSdk.wikibaseSdkStrings.alt
    - typings.wikibaseSdk.wikibaseSdkStrings.ami
    - typings.wikibaseSdk.wikibaseSdkStrings.am
    - typings.wikibaseSdk.wikibaseSdkStrings.ang
    - typings.wikibaseSdk.wikibaseSdkStrings.anp
    - typings.wikibaseSdk.wikibaseSdkStrings.an
    - typings.wikibaseSdk.wikibaseSdkStrings.arc
    - typings.wikibaseSdk.wikibaseSdkStrings.ar
    - typings.wikibaseSdk.wikibaseSdkStrings.ary
    - typings.wikibaseSdk.wikibaseSdkStrings.arz
    - typings.wikibaseSdk.wikibaseSdkStrings.ast
    - typings.wikibaseSdk.wikibaseSdkStrings.as
    - typings.wikibaseSdk.wikibaseSdkStrings.atj
    - typings.wikibaseSdk.wikibaseSdkStrings.avk
    - typings.wikibaseSdk.wikibaseSdkStrings.av
    - typings.wikibaseSdk.wikibaseSdkStrings.awa
    - typings.wikibaseSdk.wikibaseSdkStrings.ay
    - typings.wikibaseSdk.wikibaseSdkStrings.azb
    - typings.wikibaseSdk.wikibaseSdkStrings.az
    - typings.wikibaseSdk.wikibaseSdkStrings.ban
    - typings.wikibaseSdk.wikibaseSdkStrings.bar
    - typings.wikibaseSdk.wikibaseSdkStrings.bat_smg
    - typings.wikibaseSdk.wikibaseSdkStrings.ba
    - typings.wikibaseSdk.wikibaseSdkStrings.bcl
    - typings.wikibaseSdk.wikibaseSdkStrings.be_x_old
    - typings.wikibaseSdk.wikibaseSdkStrings.be
    - typings.wikibaseSdk.wikibaseSdkStrings.bg
    - typings.wikibaseSdk.wikibaseSdkStrings.bh
    - typings.wikibaseSdk.wikibaseSdkStrings.bi
    - typings.wikibaseSdk.wikibaseSdkStrings.bjn
    - typings.wikibaseSdk.wikibaseSdkStrings.blk
    - typings.wikibaseSdk.wikibaseSdkStrings.bm
    - typings.wikibaseSdk.wikibaseSdkStrings.bn
    - typings.wikibaseSdk.wikibaseSdkStrings.bo
    - typings.wikibaseSdk.wikibaseSdkStrings.bpy
    - typings.wikibaseSdk.wikibaseSdkStrings.br
    - typings.wikibaseSdk.wikibaseSdkStrings.bs
    - typings.wikibaseSdk.wikibaseSdkStrings.bug
    - typings.wikibaseSdk.wikibaseSdkStrings.bxr
    - typings.wikibaseSdk.wikibaseSdkStrings.ca
    - typings.wikibaseSdk.wikibaseSdkStrings.cbk_zam
    - typings.wikibaseSdk.wikibaseSdkStrings.cdo
    - typings.wikibaseSdk.wikibaseSdkStrings.ceb
    - typings.wikibaseSdk.wikibaseSdkStrings.ce
    - typings.wikibaseSdk.wikibaseSdkStrings.cho
    - typings.wikibaseSdk.wikibaseSdkStrings.chr
    - typings.wikibaseSdk.wikibaseSdkStrings.ch
    - typings.wikibaseSdk.wikibaseSdkStrings.chy
    - typings.wikibaseSdk.wikibaseSdkStrings.ckb
    - typings.wikibaseSdk.wikibaseSdkStrings.co
    - typings.wikibaseSdk.wikibaseSdkStrings.crh
    - typings.wikibaseSdk.wikibaseSdkStrings.cr
    - typings.wikibaseSdk.wikibaseSdkStrings.csb
    - typings.wikibaseSdk.wikibaseSdkStrings.cs
    - typings.wikibaseSdk.wikibaseSdkStrings.cu
    - typings.wikibaseSdk.wikibaseSdkStrings.cv
    - typings.wikibaseSdk.wikibaseSdkStrings.cy
    - typings.wikibaseSdk.wikibaseSdkStrings.dag
    - typings.wikibaseSdk.wikibaseSdkStrings.da
    - typings.wikibaseSdk.wikibaseSdkStrings.de
    - typings.wikibaseSdk.wikibaseSdkStrings.din
    - typings.wikibaseSdk.wikibaseSdkStrings.diq
    - typings.wikibaseSdk.wikibaseSdkStrings.dsb
    - typings.wikibaseSdk.wikibaseSdkStrings.dty
    - typings.wikibaseSdk.wikibaseSdkStrings.dv
    - typings.wikibaseSdk.wikibaseSdkStrings.dz
    - typings.wikibaseSdk.wikibaseSdkStrings.ee
    - typings.wikibaseSdk.wikibaseSdkStrings.el
    - typings.wikibaseSdk.wikibaseSdkStrings.eml
    - typings.wikibaseSdk.wikibaseSdkStrings.en
    - typings.wikibaseSdk.wikibaseSdkStrings.eo
    - typings.wikibaseSdk.wikibaseSdkStrings.es
    - typings.wikibaseSdk.wikibaseSdkStrings.et
    - typings.wikibaseSdk.wikibaseSdkStrings.eu
    - typings.wikibaseSdk.wikibaseSdkStrings.ext
    - typings.wikibaseSdk.wikibaseSdkStrings.fa
    - typings.wikibaseSdk.wikibaseSdkStrings.ff
    - typings.wikibaseSdk.wikibaseSdkStrings.fiu_vro
    - typings.wikibaseSdk.wikibaseSdkStrings.fi
    - typings.wikibaseSdk.wikibaseSdkStrings.fj
    - typings.wikibaseSdk.wikibaseSdkStrings.fo
    - typings.wikibaseSdk.wikibaseSdkStrings.frp
    - typings.wikibaseSdk.wikibaseSdkStrings.frr
    - typings.wikibaseSdk.wikibaseSdkStrings.fr
    - typings.wikibaseSdk.wikibaseSdkStrings.fur
    - typings.wikibaseSdk.wikibaseSdkStrings.fy
    - typings.wikibaseSdk.wikibaseSdkStrings.gag
    - typings.wikibaseSdk.wikibaseSdkStrings.gan
    - typings.wikibaseSdk.wikibaseSdkStrings.ga
    - typings.wikibaseSdk.wikibaseSdkStrings.gcr
    - typings.wikibaseSdk.wikibaseSdkStrings.gd
    - typings.wikibaseSdk.wikibaseSdkStrings.glk
    - typings.wikibaseSdk.wikibaseSdkStrings.gl
    - typings.wikibaseSdk.wikibaseSdkStrings.gn
    - typings.wikibaseSdk.wikibaseSdkStrings.gom
    - typings.wikibaseSdk.wikibaseSdkStrings.gor
    - typings.wikibaseSdk.wikibaseSdkStrings.got
    - typings.wikibaseSdk.wikibaseSdkStrings.guc
    - typings.wikibaseSdk.wikibaseSdkStrings.gur
    - typings.wikibaseSdk.wikibaseSdkStrings.gu
    - typings.wikibaseSdk.wikibaseSdkStrings.guw
    - typings.wikibaseSdk.wikibaseSdkStrings.gv
    - typings.wikibaseSdk.wikibaseSdkStrings.hak
    - typings.wikibaseSdk.wikibaseSdkStrings.ha
    - typings.wikibaseSdk.wikibaseSdkStrings.haw
    - typings.wikibaseSdk.wikibaseSdkStrings.he
    - typings.wikibaseSdk.wikibaseSdkStrings.hif
    - typings.wikibaseSdk.wikibaseSdkStrings.hi
    - typings.wikibaseSdk.wikibaseSdkStrings.ho
    - typings.wikibaseSdk.wikibaseSdkStrings.hr
    - typings.wikibaseSdk.wikibaseSdkStrings.hsb
    - typings.wikibaseSdk.wikibaseSdkStrings.ht
    - typings.wikibaseSdk.wikibaseSdkStrings.hu
    - typings.wikibaseSdk.wikibaseSdkStrings.hy
    - typings.wikibaseSdk.wikibaseSdkStrings.hyw
    - typings.wikibaseSdk.wikibaseSdkStrings.hz
    - typings.wikibaseSdk.wikibaseSdkStrings.ia
    - typings.wikibaseSdk.wikibaseSdkStrings.id
    - typings.wikibaseSdk.wikibaseSdkStrings.ie
    - typings.wikibaseSdk.wikibaseSdkStrings.ig
    - typings.wikibaseSdk.wikibaseSdkStrings.ii
    - typings.wikibaseSdk.wikibaseSdkStrings.ik
    - typings.wikibaseSdk.wikibaseSdkStrings.ilo
    - typings.wikibaseSdk.wikibaseSdkStrings.inh
    - typings.wikibaseSdk.wikibaseSdkStrings.io
    - typings.wikibaseSdk.wikibaseSdkStrings.is
    - typings.wikibaseSdk.wikibaseSdkStrings.it
    - typings.wikibaseSdk.wikibaseSdkStrings.iu
    - typings.wikibaseSdk.wikibaseSdkStrings.jam
    - typings.wikibaseSdk.wikibaseSdkStrings.ja
    - typings.wikibaseSdk.wikibaseSdkStrings.jbo
    - typings.wikibaseSdk.wikibaseSdkStrings.jv
    - typings.wikibaseSdk.wikibaseSdkStrings.kaa
    - typings.wikibaseSdk.wikibaseSdkStrings.kab
    - typings.wikibaseSdk.wikibaseSdkStrings.ka
    - typings.wikibaseSdk.wikibaseSdkStrings.kbd
    - typings.wikibaseSdk.wikibaseSdkStrings.kbp
    - typings.wikibaseSdk.wikibaseSdkStrings.kcg
    - typings.wikibaseSdk.wikibaseSdkStrings.kg
    - typings.wikibaseSdk.wikibaseSdkStrings.ki
    - typings.wikibaseSdk.wikibaseSdkStrings.kj
    - typings.wikibaseSdk.wikibaseSdkStrings.kk
    - typings.wikibaseSdk.wikibaseSdkStrings.kl
    - typings.wikibaseSdk.wikibaseSdkStrings.km
    - typings.wikibaseSdk.wikibaseSdkStrings.kn
    - typings.wikibaseSdk.wikibaseSdkStrings.koi
    - typings.wikibaseSdk.wikibaseSdkStrings.ko
    - typings.wikibaseSdk.wikibaseSdkStrings.krc
    - typings.wikibaseSdk.wikibaseSdkStrings.kr
    - typings.wikibaseSdk.wikibaseSdkStrings.ksh
    - typings.wikibaseSdk.wikibaseSdkStrings.ks
    - typings.wikibaseSdk.wikibaseSdkStrings.ku
    - typings.wikibaseSdk.wikibaseSdkStrings.kv
    - typings.wikibaseSdk.wikibaseSdkStrings.kw
    - typings.wikibaseSdk.wikibaseSdkStrings.ky
    - typings.wikibaseSdk.wikibaseSdkStrings.lad
    - typings.wikibaseSdk.wikibaseSdkStrings.la
    - typings.wikibaseSdk.wikibaseSdkStrings.lbe
    - typings.wikibaseSdk.wikibaseSdkStrings.lb
    - typings.wikibaseSdk.wikibaseSdkStrings.lez
    - typings.wikibaseSdk.wikibaseSdkStrings.lfn
    - typings.wikibaseSdk.wikibaseSdkStrings.lg
    - typings.wikibaseSdk.wikibaseSdkStrings.lij
    - typings.wikibaseSdk.wikibaseSdkStrings.li
    - typings.wikibaseSdk.wikibaseSdkStrings.lld
    - typings.wikibaseSdk.wikibaseSdkStrings.lmo
    - typings.wikibaseSdk.wikibaseSdkStrings.ln
    - typings.wikibaseSdk.wikibaseSdkStrings.lo
    - typings.wikibaseSdk.wikibaseSdkStrings.lrc
    - typings.wikibaseSdk.wikibaseSdkStrings.ltg
    - typings.wikibaseSdk.wikibaseSdkStrings.lt
    - typings.wikibaseSdk.wikibaseSdkStrings.lv
    - typings.wikibaseSdk.wikibaseSdkStrings.mad
    - typings.wikibaseSdk.wikibaseSdkStrings.mai
    - typings.wikibaseSdk.wikibaseSdkStrings.map_bms
    - typings.wikibaseSdk.wikibaseSdkStrings.mdf
    - typings.wikibaseSdk.wikibaseSdkStrings.mg
    - typings.wikibaseSdk.wikibaseSdkStrings.mhr
    - typings.wikibaseSdk.wikibaseSdkStrings.mh
    - typings.wikibaseSdk.wikibaseSdkStrings.min
    - typings.wikibaseSdk.wikibaseSdkStrings.mi
    - typings.wikibaseSdk.wikibaseSdkStrings.mk
    - typings.wikibaseSdk.wikibaseSdkStrings.ml
    - typings.wikibaseSdk.wikibaseSdkStrings.mni
    - typings.wikibaseSdk.wikibaseSdkStrings.mn
    - typings.wikibaseSdk.wikibaseSdkStrings.mnw
    - typings.wikibaseSdk.wikibaseSdkStrings.mo
    - typings.wikibaseSdk.wikibaseSdkStrings.mrj
    - typings.wikibaseSdk.wikibaseSdkStrings.mr
    - typings.wikibaseSdk.wikibaseSdkStrings.ms
    - typings.wikibaseSdk.wikibaseSdkStrings.mt
    - typings.wikibaseSdk.wikibaseSdkStrings.mus
    - typings.wikibaseSdk.wikibaseSdkStrings.mwl
    - typings.wikibaseSdk.wikibaseSdkStrings.myv
    - typings.wikibaseSdk.wikibaseSdkStrings.my
    - typings.wikibaseSdk.wikibaseSdkStrings.mzn
    - typings.wikibaseSdk.wikibaseSdkStrings.nah
    - typings.wikibaseSdk.wikibaseSdkStrings.nap
    - typings.wikibaseSdk.wikibaseSdkStrings.na
    - typings.wikibaseSdk.wikibaseSdkStrings.nds_nl
    - typings.wikibaseSdk.wikibaseSdkStrings.nds
    - typings.wikibaseSdk.wikibaseSdkStrings.ne
    - typings.wikibaseSdk.wikibaseSdkStrings.`new`
    - typings.wikibaseSdk.wikibaseSdkStrings.ng
    - typings.wikibaseSdk.wikibaseSdkStrings.nia
    - typings.wikibaseSdk.wikibaseSdkStrings.nl
    - typings.wikibaseSdk.wikibaseSdkStrings.nn
    - typings.wikibaseSdk.wikibaseSdkStrings.nov
    - typings.wikibaseSdk.wikibaseSdkStrings.no
    - typings.wikibaseSdk.wikibaseSdkStrings.nqo
    - typings.wikibaseSdk.wikibaseSdkStrings.nrm
    - typings.wikibaseSdk.wikibaseSdkStrings.nso
    - typings.wikibaseSdk.wikibaseSdkStrings.nv
    - typings.wikibaseSdk.wikibaseSdkStrings.ny
    - typings.wikibaseSdk.wikibaseSdkStrings.oc
    - typings.wikibaseSdk.wikibaseSdkStrings.olo
    - typings.wikibaseSdk.wikibaseSdkStrings.om
    - typings.wikibaseSdk.wikibaseSdkStrings.or
    - typings.wikibaseSdk.wikibaseSdkStrings.os
    - typings.wikibaseSdk.wikibaseSdkStrings.pag
    - typings.wikibaseSdk.wikibaseSdkStrings.pam
    - typings.wikibaseSdk.wikibaseSdkStrings.pap
    - typings.wikibaseSdk.wikibaseSdkStrings.pa
    - typings.wikibaseSdk.wikibaseSdkStrings.pcd
    - typings.wikibaseSdk.wikibaseSdkStrings.pcm
    - typings.wikibaseSdk.wikibaseSdkStrings.pdc
    - typings.wikibaseSdk.wikibaseSdkStrings.pfl
    - typings.wikibaseSdk.wikibaseSdkStrings.pih
    - typings.wikibaseSdk.wikibaseSdkStrings.pi
    - typings.wikibaseSdk.wikibaseSdkStrings.pl
    - typings.wikibaseSdk.wikibaseSdkStrings.pms
    - typings.wikibaseSdk.wikibaseSdkStrings.pnb
    - typings.wikibaseSdk.wikibaseSdkStrings.pnt
    - typings.wikibaseSdk.wikibaseSdkStrings.ps
    - typings.wikibaseSdk.wikibaseSdkStrings.pt
    - typings.wikibaseSdk.wikibaseSdkStrings.pwn
    - typings.wikibaseSdk.wikibaseSdkStrings.qu
    - typings.wikibaseSdk.wikibaseSdkStrings.rm
    - typings.wikibaseSdk.wikibaseSdkStrings.rmy
    - typings.wikibaseSdk.wikibaseSdkStrings.rn
    - typings.wikibaseSdk.wikibaseSdkStrings.roa_rup
    - typings.wikibaseSdk.wikibaseSdkStrings.roa_tara
    - typings.wikibaseSdk.wikibaseSdkStrings.ro
    - typings.wikibaseSdk.wikibaseSdkStrings.rue
    - typings.wikibaseSdk.wikibaseSdkStrings.ru
    - typings.wikibaseSdk.wikibaseSdkStrings.rw
    - typings.wikibaseSdk.wikibaseSdkStrings.sah
    - typings.wikibaseSdk.wikibaseSdkStrings.sat
    - typings.wikibaseSdk.wikibaseSdkStrings.sa
    - typings.wikibaseSdk.wikibaseSdkStrings.scn
    - typings.wikibaseSdk.wikibaseSdkStrings.sco
    - typings.wikibaseSdk.wikibaseSdkStrings.sc
    - typings.wikibaseSdk.wikibaseSdkStrings.sd
    - typings.wikibaseSdk.wikibaseSdkStrings.se
    - typings.wikibaseSdk.wikibaseSdkStrings.sg
    - typings.wikibaseSdk.wikibaseSdkStrings.shi
    - typings.wikibaseSdk.wikibaseSdkStrings.shn
    - typings.wikibaseSdk.wikibaseSdkStrings.sh
    - typings.wikibaseSdk.wikibaseSdkStrings.shy
    - typings.wikibaseSdk.wikibaseSdkStrings.simple
    - typings.wikibaseSdk.wikibaseSdkStrings.si
    - typings.wikibaseSdk.wikibaseSdkStrings.skr
    - typings.wikibaseSdk.wikibaseSdkStrings.sk
    - typings.wikibaseSdk.wikibaseSdkStrings.sl
    - typings.wikibaseSdk.wikibaseSdkStrings.smn
    - typings.wikibaseSdk.wikibaseSdkStrings.sm
    - typings.wikibaseSdk.wikibaseSdkStrings.sn
    - typings.wikibaseSdk.wikibaseSdkStrings.sources
    - typings.wikibaseSdk.wikibaseSdkStrings.so
    - typings.wikibaseSdk.wikibaseSdkStrings.sq
    - typings.wikibaseSdk.wikibaseSdkStrings.srn
    - typings.wikibaseSdk.wikibaseSdkStrings.sr
    - typings.wikibaseSdk.wikibaseSdkStrings.ss
    - typings.wikibaseSdk.wikibaseSdkStrings.stq
    - typings.wikibaseSdk.wikibaseSdkStrings.st
    - typings.wikibaseSdk.wikibaseSdkStrings.su
    - typings.wikibaseSdk.wikibaseSdkStrings.sv
    - typings.wikibaseSdk.wikibaseSdkStrings.sw
    - typings.wikibaseSdk.wikibaseSdkStrings.szl
    - typings.wikibaseSdk.wikibaseSdkStrings.szy
    - typings.wikibaseSdk.wikibaseSdkStrings.ta
    - typings.wikibaseSdk.wikibaseSdkStrings.tay
    - typings.wikibaseSdk.wikibaseSdkStrings.tcy
    - typings.wikibaseSdk.wikibaseSdkStrings.tet
    - typings.wikibaseSdk.wikibaseSdkStrings.te
    - typings.wikibaseSdk.wikibaseSdkStrings.tg
    - typings.wikibaseSdk.wikibaseSdkStrings.th
    - typings.wikibaseSdk.wikibaseSdkStrings.ti
    - typings.wikibaseSdk.wikibaseSdkStrings.tk
    - typings.wikibaseSdk.wikibaseSdkStrings.tl
    - typings.wikibaseSdk.wikibaseSdkStrings.tn
    - typings.wikibaseSdk.wikibaseSdkStrings.to
    - typings.wikibaseSdk.wikibaseSdkStrings.tpi
    - typings.wikibaseSdk.wikibaseSdkStrings.trv
    - typings.wikibaseSdk.wikibaseSdkStrings.tr
    - typings.wikibaseSdk.wikibaseSdkStrings.ts
    - typings.wikibaseSdk.wikibaseSdkStrings.tt
    - typings.wikibaseSdk.wikibaseSdkStrings.tum
    - typings.wikibaseSdk.wikibaseSdkStrings.tw
    - typings.wikibaseSdk.wikibaseSdkStrings.tyv
    - typings.wikibaseSdk.wikibaseSdkStrings.ty
    - typings.wikibaseSdk.wikibaseSdkStrings.udm
    - typings.wikibaseSdk.wikibaseSdkStrings.ug
    - typings.wikibaseSdk.wikibaseSdkStrings.uk
    - typings.wikibaseSdk.wikibaseSdkStrings.ur
    - typings.wikibaseSdk.wikibaseSdkStrings.uz
    - typings.wikibaseSdk.wikibaseSdkStrings.vec
    - typings.wikibaseSdk.wikibaseSdkStrings.vep
    - typings.wikibaseSdk.wikibaseSdkStrings.ve
    - typings.wikibaseSdk.wikibaseSdkStrings.vi
    - typings.wikibaseSdk.wikibaseSdkStrings.vls
    - typings.wikibaseSdk.wikibaseSdkStrings.vo
    - typings.wikibaseSdk.wikibaseSdkStrings.war
    - typings.wikibaseSdk.wikibaseSdkStrings.wa
    - typings.wikibaseSdk.wikibaseSdkStrings.wo
    - typings.wikibaseSdk.wikibaseSdkStrings.wuu
    - typings.wikibaseSdk.wikibaseSdkStrings.xal
    - typings.wikibaseSdk.wikibaseSdkStrings.xh
    - typings.wikibaseSdk.wikibaseSdkStrings.xmf
    - typings.wikibaseSdk.wikibaseSdkStrings.yi
    - typings.wikibaseSdk.wikibaseSdkStrings.yo
    - typings.wikibaseSdk.wikibaseSdkStrings.yue
    - typings.wikibaseSdk.wikibaseSdkStrings.za
    - typings.wikibaseSdk.wikibaseSdkStrings.zea
    - typings.wikibaseSdk.wikibaseSdkStrings.zh_classical
    - typings.wikibaseSdk.wikibaseSdkStrings.zh_min_nan
    - typings.wikibaseSdk.wikibaseSdkStrings.zh_yue
    - typings.wikibaseSdk.wikibaseSdkStrings.zh
    - typings.wikibaseSdk.wikibaseSdkStrings.zu
  */
  trait WmLanguageCode extends StObject
}
