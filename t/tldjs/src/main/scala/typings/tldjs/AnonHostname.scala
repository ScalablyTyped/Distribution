package typings.tldjs

import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHostname extends js.Object {
  var domain: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof getDomain */ js.Any
  ]
  var hostname: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof extractHostname */ js.Any
  ]
  var isIp: Boolean
  var isValid: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof isValid */ js.Any
  ]
  var publicSuffix: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof getPublicSuffix */ js.Any
  ]
  var subdomain: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof getSubdomain */ js.Any
  ]
  var tldExists: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof tldExists */ js.Any
  ]
}

object AnonHostname {
  @scala.inline
  def apply(
    domain: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getDomain */ js.Any
    ],
    hostname: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof extractHostname */ js.Any
    ],
    isIp: Boolean,
    isValid: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof isValid */ js.Any
    ],
    publicSuffix: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getPublicSuffix */ js.Any
    ],
    subdomain: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getSubdomain */ js.Any
    ],
    tldExists: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof tldExists */ js.Any
    ]
  ): AnonHostname = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], isIp = isIp.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], publicSuffix = publicSuffix.asInstanceOf[js.Any], subdomain = subdomain.asInstanceOf[js.Any], tldExists = tldExists.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHostname]
  }
}

