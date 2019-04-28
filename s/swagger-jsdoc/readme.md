
# Scala.js typings for swagger-jsdoc


## Library description:
Generates swagger doc based on JSDoc

|                    |                 |
| ------------------ | :-------------: |
| Full name          | swagger-jsdoc |
| Keywords           | jsdoc, restful, api, express, swagger |
| # releases         | 24 |
| # dependents       | 58 |
| # downloads        | 1961207 |
| # stars            | 20 |

## Links
- [Homepage](https://github.com/Surnet/swagger-jsdoc)
- [Bugs](https://github.com/Surnet/swagger-jsdoc/issues)
- [Repository](https://github.com/Surnet/swagger-jsdoc)
- [Npm](https://www.npmjs.com/package/swagger-jsdoc)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
// Type definitions for Swagger-JSDoc
// Project: https://github.com/surnet/swagger-jsdoc
// Definitions by: Daniel Grove <https://github.com/drGrove>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.2
/* =================== USAGE ===================

    import * as express from "express"
    import swaggerJSDoc = require('swagger-jsdoc');
    const app = express()

    let options = {
        swaggerDefinition: {
          info: {
            title: 'Hello World',
            version: '1.0.0',
            description: 'A sample API'
          },
          host: 'localhost:3000',
          basePath: '/'
        },
        apis: [
          './example/routes*.js',
          './example/parameters.yaml'
        ]
      }
    };

    var spec = swaggerJSDoc(options);

    app.get('/api-docs.json', function(req, res) {
      res.setHeader('Content-Type', 'application/json');
      res.send(spec);
    });

 =============================================== */


```

